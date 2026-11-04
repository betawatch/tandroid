package ai;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import b8.mf;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.n10;
import org.telegram.messenger.s10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h6 extends ma {
    public static final /* synthetic */ int d2 = 0;
    public final String Q1;
    public final g6 R1;
    public final HorizontalScrollView S1;
    public final o5 T1;
    public final o5 U1;
    public final o5 V1;
    public final o5 W1;
    public final ci.q4 X1;
    public ci.e2 Y1;
    public final HashSet Z1;
    public boolean a2;
    public f6 b2;
    public boolean c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(final Context context, String str, final g6 g6Var) {
        super(2, context, (org.telegram.ui.ActionBar.e6) null, false);
        final int i3 = 2;
        final int i10 = 0;
        this.Z1 = new HashSet();
        this.C1 = org.telegram.messenger.g0.L(12.0f);
        N();
        this.Q1 = str;
        this.R1 = g6Var;
        this.m1.setTitle(O0());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f));
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.S1 = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipChildren(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.addView(linearLayout);
        o5 o5Var = new o5(context, this.J0);
        this.T1 = o5Var;
        o5Var.setSorting(g6Var.c.p);
        linearLayout.addView(o5Var, mf.t(-2, -2, 16, 0, 0, 6, 0));
        o5Var.setOnClickListener(new d(i3, this, g6Var));
        o5 o5Var2 = new o5(context, this.J0);
        this.U1 = o5Var2;
        o5Var2.setValue(bd.M0(2131750395, null));
        linearLayout.addView(o5Var2, mf.t(-2, -2, 16, 0, 0, 6, 0));
        o5Var2.setOnClickListener(new View.OnClickListener(this) { // from class: ai.e6
            public final /* synthetic */ h6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                final g6 g6Var2 = g6Var;
                h6 h6Var = this.b;
                final int i12 = 2;
                final int i13 = 1;
                switch (i11) {
                    case 0:
                        w5 w5Var = g6Var2.c;
                        if (!w5Var.f.isEmpty()) {
                            final f60 f60Var = new f60(h6Var.c, h6Var.J0, h6Var.U1, false, true, false);
                            f60Var.t = false;
                            f60Var.Y = true;
                            f60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            f60Var.R = true;
                            f60Var.p = new g4(f60Var, 6);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(w5Var.f);
                            final int i14 = 2;
                            Collections.sort(arrayList, new Comparator() { // from class: ai.b6
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i14) {
                                        case 0:
                                            g6 g6Var3 = g6Var2;
                                            Integer num = (Integer) g6Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) g6Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            g6 g6Var4 = g6Var2;
                                            Integer num3 = (Integer) g6Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) g6Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            g6 g6Var5 = g6Var2;
                                            Integer num5 = (Integer) g6Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) g6Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i15 = h6Var.a;
                            final int i16 = 0;
                            Context context2 = context;
                            i5 i5Var = new i5(context2, i15, 0, false, new n10() { // from class: ai.x5
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.n10
                                public final void a(Object obj, Object obj2) {
                                    int i17 = i16;
                                    boolean z10 = false;
                                    ArrayList arrayList2 = arrayList;
                                    g6 g6Var3 = g6Var2;
                                    String[] strArr2 = strArr;
                                    switch (i17) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            String lowerCase = strArr2[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            w5 w5Var2 = g6Var3.c;
                                            boolean isEmpty = w5Var2.j.isEmpty();
                                            int size = arrayList2.size();
                                            int i18 = 0;
                                            while (i18 < size) {
                                                Object obj3 = arrayList2.get(i18);
                                                i18++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = w5Var2.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || k2.p1.z(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) w5Var2.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i19 = q5.b;
                                                    r31 K = r31.K(q5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.l = lowerCase;
                                                    K.z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList3.add(K);
                                                }
                                            }
                                            if (arrayList3.isEmpty()) {
                                                arrayList3.add(m5.i(bd.M0(2131750018, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr2[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            w5 w5Var3 = g6Var3.c;
                                            boolean isEmpty2 = w5Var3.k.isEmpty();
                                            int size2 = arrayList2.size();
                                            int i20 = 0;
                                            while (i20 < size2) {
                                                Object obj4 = arrayList2.get(i20);
                                                i20++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = w5Var3.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || k2.p1.z(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) w5Var3.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i21 = k5.b;
                                                    r31 K2 = r31.K(k5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.l = lowerCase2;
                                                    K2.z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(m5.i(bd.M0(2131750023, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr2[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            w5 w5Var4 = g6Var3.c;
                                            boolean isEmpty3 = w5Var4.l.isEmpty();
                                            int size3 = arrayList2.size();
                                            int i22 = 0;
                                            while (i22 < size3) {
                                                Object obj5 = arrayList2.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = w5Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || k2.p1.z(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) w5Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i23 = t5.b;
                                                    r31 K3 = r31.K(t5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.l = lowerCase3;
                                                    K3.z = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(m5.i(bd.M0(2131750016, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, new s10() { // from class: ai.y5
                                @Override // org.telegram.messenger.s10
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    r31 r31Var = (r31) obj;
                                    switch (i16) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) r31Var.G).document.id;
                                            w5 w5Var2 = g6Var2.c;
                                            HashSet hashSet = w5Var2.j;
                                            if (hashSet.contains(Long.valueOf(j10))) {
                                                hashSet.remove(Long.valueOf(j10));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList2 = w5Var2.f;
                                                int size = arrayList2.size();
                                                int i17 = 0;
                                                while (i17 < size) {
                                                    Object obj3 = arrayList2.get(i17);
                                                    i17++;
                                                    long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j11 != j10) {
                                                        hashSet.add(Long.valueOf(j11));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j10));
                                            }
                                            w5Var2.h();
                                            f60Var.u();
                                            break;
                                        case 1:
                                            int i18 = ((TL_stars.starGiftAttributeBackdrop) r31Var.G).backdrop_id;
                                            w5 w5Var3 = g6Var2.c;
                                            HashSet hashSet2 = w5Var3.k;
                                            if (hashSet2.contains(Integer.valueOf(i18))) {
                                                hashSet2.remove(Integer.valueOf(i18));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList3 = w5Var3.g;
                                                int size2 = arrayList3.size();
                                                int i19 = 0;
                                                while (i19 < size2) {
                                                    Object obj4 = arrayList3.get(i19);
                                                    i19++;
                                                    int i20 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i20 != i18) {
                                                        hashSet2.add(Integer.valueOf(i20));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i18));
                                            }
                                            w5Var3.h();
                                            f60Var.u();
                                            break;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) r31Var.G).document.id;
                                            w5 w5Var4 = g6Var2.c;
                                            HashSet hashSet3 = w5Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j12))) {
                                                hashSet3.remove(Long.valueOf(j12));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = w5Var4.h;
                                                int size3 = arrayList4.size();
                                                int i21 = 0;
                                                while (i21 < size3) {
                                                    Object obj5 = arrayList4.get(i21);
                                                    i21++;
                                                    long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j13 != j12) {
                                                        hashSet3.add(Long.valueOf(j13));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j12));
                                            }
                                            w5Var4.h();
                                            f60Var.u();
                                            break;
                                    }
                                }
                            }, null, h6Var.J0, 4);
                            i5Var.g3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.F8, h6Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, mf.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xs xsVar = new xs(context2, h6Var.J0);
                            xsVar.setTextSize(1, 16.0f);
                            xsVar.setInputType(573441);
                            xsVar.setRawInputType(573441);
                            org.telegram.ui.ActionBar.r6.E(xsVar, org.telegram.ui.ActionBar.k6.A6, h6Var.J0);
                            org.telegram.ui.ActionBar.r6.m(xsVar, 30, org.telegram.ui.ActionBar.k6.G6, h6Var.J0);
                            xsVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            xsVar.setCursorWidth(1.5f);
                            xsVar.setHint(bd.M0(2131750017, null));
                            org.telegram.ui.ActionBar.r6.V(xsVar, org.telegram.ui.ActionBar.k6.E8, h6Var.J0);
                            xsVar.setBackground(null);
                            frameLayout.addView(xsVar, mf.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xsVar.addTextChangedListener(new a0(strArr, i5Var, false, 4));
                            if (arrayList.size() > 8) {
                                f60Var.r(frameLayout, mf.o(-1, 44));
                                f60Var.k();
                            }
                            if (!w5Var.j.isEmpty()) {
                                f60Var.c(R.drawable.msg_select, bd.M0(2131745680, null), new z5(g6Var2, 0), false);
                            }
                            f60Var.q(i5Var);
                            f60Var.Z();
                            break;
                        }
                        break;
                    case 1:
                        w5 w5Var2 = g6Var2.c;
                        if (!w5Var2.g.isEmpty()) {
                            final f60 f60Var2 = new f60(h6Var.c, h6Var.J0, h6Var.V1, false, true, false);
                            f60Var2.t = false;
                            f60Var2.Y = true;
                            f60Var2.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            f60Var2.R = true;
                            f60Var2.p = new g4(f60Var2, 4);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(w5Var2.g);
                            final int i17 = 0;
                            Collections.sort(arrayList2, new Comparator() { // from class: ai.b6
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i17) {
                                        case 0:
                                            g6 g6Var3 = g6Var2;
                                            Integer num = (Integer) g6Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) g6Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            g6 g6Var4 = g6Var2;
                                            Integer num3 = (Integer) g6Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) g6Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            g6 g6Var5 = g6Var2;
                                            Integer num5 = (Integer) g6Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) g6Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i18 = h6Var.a;
                            Context context3 = context;
                            i5 i5Var2 = new i5(context3, i18, 0, false, new n10() { // from class: ai.x5
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.n10
                                public final void a(Object obj, Object obj2) {
                                    int i172 = i13;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    g6 g6Var3 = g6Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i172) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            w5 w5Var22 = g6Var3.c;
                                            boolean isEmpty = w5Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i182 = 0;
                                            while (i182 < size) {
                                                Object obj3 = arrayList22.get(i182);
                                                i182++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = w5Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || k2.p1.z(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) w5Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i19 = q5.b;
                                                    r31 K = r31.K(q5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.l = lowerCase;
                                                    K.z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList3.add(K);
                                                }
                                            }
                                            if (arrayList3.isEmpty()) {
                                                arrayList3.add(m5.i(bd.M0(2131750018, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            w5 w5Var3 = g6Var3.c;
                                            boolean isEmpty2 = w5Var3.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i20 = 0;
                                            while (i20 < size2) {
                                                Object obj4 = arrayList22.get(i20);
                                                i20++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = w5Var3.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || k2.p1.z(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) w5Var3.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i21 = k5.b;
                                                    r31 K2 = r31.K(k5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.l = lowerCase2;
                                                    K2.z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(m5.i(bd.M0(2131750023, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            w5 w5Var4 = g6Var3.c;
                                            boolean isEmpty3 = w5Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size3) {
                                                Object obj5 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = w5Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || k2.p1.z(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) w5Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i23 = t5.b;
                                                    r31 K3 = r31.K(t5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.l = lowerCase3;
                                                    K3.z = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(m5.i(bd.M0(2131750016, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, new s10() { // from class: ai.y5
                                @Override // org.telegram.messenger.s10
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    r31 r31Var = (r31) obj;
                                    switch (i13) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) r31Var.G).document.id;
                                            w5 w5Var22 = g6Var2.c;
                                            HashSet hashSet = w5Var22.j;
                                            if (hashSet.contains(Long.valueOf(j10))) {
                                                hashSet.remove(Long.valueOf(j10));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = w5Var22.f;
                                                int size = arrayList22.size();
                                                int i172 = 0;
                                                while (i172 < size) {
                                                    Object obj3 = arrayList22.get(i172);
                                                    i172++;
                                                    long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j11 != j10) {
                                                        hashSet.add(Long.valueOf(j11));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j10));
                                            }
                                            w5Var22.h();
                                            f60Var2.u();
                                            break;
                                        case 1:
                                            int i182 = ((TL_stars.starGiftAttributeBackdrop) r31Var.G).backdrop_id;
                                            w5 w5Var3 = g6Var2.c;
                                            HashSet hashSet2 = w5Var3.k;
                                            if (hashSet2.contains(Integer.valueOf(i182))) {
                                                hashSet2.remove(Integer.valueOf(i182));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList3 = w5Var3.g;
                                                int size2 = arrayList3.size();
                                                int i19 = 0;
                                                while (i19 < size2) {
                                                    Object obj4 = arrayList3.get(i19);
                                                    i19++;
                                                    int i20 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i20 != i182) {
                                                        hashSet2.add(Integer.valueOf(i20));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i182));
                                            }
                                            w5Var3.h();
                                            f60Var2.u();
                                            break;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) r31Var.G).document.id;
                                            w5 w5Var4 = g6Var2.c;
                                            HashSet hashSet3 = w5Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j12))) {
                                                hashSet3.remove(Long.valueOf(j12));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = w5Var4.h;
                                                int size3 = arrayList4.size();
                                                int i21 = 0;
                                                while (i21 < size3) {
                                                    Object obj5 = arrayList4.get(i21);
                                                    i21++;
                                                    long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j13 != j12) {
                                                        hashSet3.add(Long.valueOf(j13));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j12));
                                            }
                                            w5Var4.h();
                                            f60Var2.u();
                                            break;
                                    }
                                }
                            }, null, h6Var.J0, 5);
                            i5Var2.g3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.F8, h6Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, mf.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xs xsVar2 = new xs(context3, h6Var.J0);
                            xsVar2.setTextSize(1, 16.0f);
                            xsVar2.setInputType(573441);
                            xsVar2.setRawInputType(573441);
                            org.telegram.ui.ActionBar.r6.E(xsVar2, org.telegram.ui.ActionBar.k6.A6, h6Var.J0);
                            org.telegram.ui.ActionBar.r6.m(xsVar2, 30, org.telegram.ui.ActionBar.k6.G6, h6Var.J0);
                            xsVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            xsVar2.setCursorWidth(1.5f);
                            xsVar2.setHint(bd.M0(2131750017, null));
                            org.telegram.ui.ActionBar.r6.V(xsVar2, org.telegram.ui.ActionBar.k6.E8, h6Var.J0);
                            xsVar2.setBackground(null);
                            frameLayout2.addView(xsVar2, mf.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xsVar2.addTextChangedListener(new a0(strArr2, i5Var2, false, 5));
                            if (arrayList2.size() > 8) {
                                f60Var2.r(frameLayout2, mf.o(-1, 44));
                                f60Var2.k();
                            }
                            if (!w5Var2.k.isEmpty()) {
                                f60Var2.c(R.drawable.msg_select, bd.M0(2131745680, null), new z5(g6Var2, 1), false);
                            }
                            f60Var2.q(i5Var2);
                            f60Var2.Z();
                            break;
                        }
                        break;
                    default:
                        w5 w5Var3 = g6Var2.c;
                        if (!w5Var3.h.isEmpty()) {
                            final f60 f60Var3 = new f60(h6Var.c, h6Var.J0, h6Var.W1, false, true, false);
                            f60Var3.t = false;
                            f60Var3.Y = true;
                            f60Var3.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            f60Var3.R = true;
                            f60Var3.p = new g4(f60Var3, 5);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(w5Var3.h);
                            Collections.sort(arrayList3, new Comparator() { // from class: ai.b6
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i13) {
                                        case 0:
                                            g6 g6Var3 = g6Var2;
                                            Integer num = (Integer) g6Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) g6Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            g6 g6Var4 = g6Var2;
                                            Integer num3 = (Integer) g6Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) g6Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            g6 g6Var5 = g6Var2;
                                            Integer num5 = (Integer) g6Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) g6Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            Context context4 = context;
                            i5 i5Var3 = new i5(context4, h6Var.a, 0, false, new n10() { // from class: ai.x5
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.n10
                                public final void a(Object obj, Object obj2) {
                                    int i172 = i12;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    g6 g6Var3 = g6Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i172) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            w5 w5Var22 = g6Var3.c;
                                            boolean isEmpty = w5Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i182 = 0;
                                            while (i182 < size) {
                                                Object obj3 = arrayList22.get(i182);
                                                i182++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = w5Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || k2.p1.z(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) w5Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i19 = q5.b;
                                                    r31 K = r31.K(q5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.l = lowerCase;
                                                    K.z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(m5.i(bd.M0(2131750018, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            w5 w5Var32 = g6Var3.c;
                                            boolean isEmpty2 = w5Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i20 = 0;
                                            while (i20 < size2) {
                                                Object obj4 = arrayList22.get(i20);
                                                i20++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = w5Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || k2.p1.z(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) w5Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i21 = k5.b;
                                                    r31 K2 = r31.K(k5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.l = lowerCase2;
                                                    K2.z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(m5.i(bd.M0(2131750023, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            w5 w5Var4 = g6Var3.c;
                                            boolean isEmpty3 = w5Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size3) {
                                                Object obj5 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = w5Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || k2.p1.z(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) w5Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i23 = t5.b;
                                                    r31 K3 = r31.K(t5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.l = lowerCase3;
                                                    K3.z = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(m5.i(bd.M0(2131750016, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, new s10() { // from class: ai.y5
                                @Override // org.telegram.messenger.s10
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    r31 r31Var = (r31) obj;
                                    switch (i12) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) r31Var.G).document.id;
                                            w5 w5Var22 = g6Var2.c;
                                            HashSet hashSet = w5Var22.j;
                                            if (hashSet.contains(Long.valueOf(j10))) {
                                                hashSet.remove(Long.valueOf(j10));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = w5Var22.f;
                                                int size = arrayList22.size();
                                                int i172 = 0;
                                                while (i172 < size) {
                                                    Object obj3 = arrayList22.get(i172);
                                                    i172++;
                                                    long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j11 != j10) {
                                                        hashSet.add(Long.valueOf(j11));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j10));
                                            }
                                            w5Var22.h();
                                            f60Var3.u();
                                            break;
                                        case 1:
                                            int i182 = ((TL_stars.starGiftAttributeBackdrop) r31Var.G).backdrop_id;
                                            w5 w5Var32 = g6Var2.c;
                                            HashSet hashSet2 = w5Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i182))) {
                                                hashSet2.remove(Integer.valueOf(i182));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = w5Var32.g;
                                                int size2 = arrayList32.size();
                                                int i19 = 0;
                                                while (i19 < size2) {
                                                    Object obj4 = arrayList32.get(i19);
                                                    i19++;
                                                    int i20 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i20 != i182) {
                                                        hashSet2.add(Integer.valueOf(i20));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i182));
                                            }
                                            w5Var32.h();
                                            f60Var3.u();
                                            break;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) r31Var.G).document.id;
                                            w5 w5Var4 = g6Var2.c;
                                            HashSet hashSet3 = w5Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j12))) {
                                                hashSet3.remove(Long.valueOf(j12));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = w5Var4.h;
                                                int size3 = arrayList4.size();
                                                int i21 = 0;
                                                while (i21 < size3) {
                                                    Object obj5 = arrayList4.get(i21);
                                                    i21++;
                                                    long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j13 != j12) {
                                                        hashSet3.add(Long.valueOf(j13));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j12));
                                            }
                                            w5Var4.h();
                                            f60Var3.u();
                                            break;
                                    }
                                }
                            }, null, h6Var.J0, 6);
                            i5Var3.g3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.r6.t(imageView3, org.telegram.ui.ActionBar.k6.F8, h6Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, mf.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xs xsVar3 = new xs(context4, h6Var.J0);
                            xsVar3.setTextSize(1, 16.0f);
                            xsVar3.setInputType(573441);
                            xsVar3.setRawInputType(573441);
                            org.telegram.ui.ActionBar.r6.E(xsVar3, org.telegram.ui.ActionBar.k6.A6, h6Var.J0);
                            org.telegram.ui.ActionBar.r6.m(xsVar3, 30, org.telegram.ui.ActionBar.k6.G6, h6Var.J0);
                            xsVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            xsVar3.setCursorWidth(1.5f);
                            xsVar3.setHint(bd.M0(2131750017, null));
                            org.telegram.ui.ActionBar.r6.V(xsVar3, org.telegram.ui.ActionBar.k6.E8, h6Var.J0);
                            xsVar3.setBackground(null);
                            frameLayout3.addView(xsVar3, mf.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xsVar3.addTextChangedListener(new a0(strArr3, i5Var3, false, 6));
                            if (arrayList3.size() > 8) {
                                f60Var3.r(frameLayout3, mf.o(-1, 44));
                                f60Var3.k();
                            }
                            if (!w5Var3.l.isEmpty()) {
                                f60Var3.c(R.drawable.msg_select, bd.M0(2131745680, null), new z5(g6Var2, 2), false);
                            }
                            f60Var3.q(i5Var3);
                            f60Var3.Z();
                            break;
                        }
                        break;
                }
            }
        });
        o5 o5Var3 = new o5(context, this.J0);
        this.V1 = o5Var3;
        o5Var3.setValue(bd.M0(2131750396, null));
        linearLayout.addView(o5Var3, mf.t(-2, -2, 16, 0, 0, 6, 0));
        final int i11 = 1;
        o5Var3.setOnClickListener(new View.OnClickListener(this) { // from class: ai.e6
            public final /* synthetic */ h6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                final g6 g6Var2 = g6Var;
                h6 h6Var = this.b;
                final int i12 = 2;
                final int i13 = 1;
                switch (i112) {
                    case 0:
                        w5 w5Var = g6Var2.c;
                        if (!w5Var.f.isEmpty()) {
                            final f60 f60Var = new f60(h6Var.c, h6Var.J0, h6Var.U1, false, true, false);
                            f60Var.t = false;
                            f60Var.Y = true;
                            f60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            f60Var.R = true;
                            f60Var.p = new g4(f60Var, 6);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(w5Var.f);
                            final int i14 = 2;
                            Collections.sort(arrayList, new Comparator() { // from class: ai.b6
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i14) {
                                        case 0:
                                            g6 g6Var3 = g6Var2;
                                            Integer num = (Integer) g6Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) g6Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            g6 g6Var4 = g6Var2;
                                            Integer num3 = (Integer) g6Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) g6Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            g6 g6Var5 = g6Var2;
                                            Integer num5 = (Integer) g6Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) g6Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i15 = h6Var.a;
                            final int i16 = 0;
                            Context context2 = context;
                            i5 i5Var = new i5(context2, i15, 0, false, new n10() { // from class: ai.x5
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.n10
                                public final void a(Object obj, Object obj2) {
                                    int i172 = i16;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList;
                                    g6 g6Var3 = g6Var2;
                                    String[] strArr22 = strArr;
                                    switch (i172) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            w5 w5Var22 = g6Var3.c;
                                            boolean isEmpty = w5Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i182 = 0;
                                            while (i182 < size) {
                                                Object obj3 = arrayList22.get(i182);
                                                i182++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = w5Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || k2.p1.z(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) w5Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i19 = q5.b;
                                                    r31 K = r31.K(q5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.l = lowerCase;
                                                    K.z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(m5.i(bd.M0(2131750018, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            w5 w5Var32 = g6Var3.c;
                                            boolean isEmpty2 = w5Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i20 = 0;
                                            while (i20 < size2) {
                                                Object obj4 = arrayList22.get(i20);
                                                i20++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = w5Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || k2.p1.z(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) w5Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i21 = k5.b;
                                                    r31 K2 = r31.K(k5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.l = lowerCase2;
                                                    K2.z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(m5.i(bd.M0(2131750023, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            w5 w5Var4 = g6Var3.c;
                                            boolean isEmpty3 = w5Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size3) {
                                                Object obj5 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = w5Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || k2.p1.z(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) w5Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i23 = t5.b;
                                                    r31 K3 = r31.K(t5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.l = lowerCase3;
                                                    K3.z = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(m5.i(bd.M0(2131750016, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, new s10() { // from class: ai.y5
                                @Override // org.telegram.messenger.s10
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    r31 r31Var = (r31) obj;
                                    switch (i16) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) r31Var.G).document.id;
                                            w5 w5Var22 = g6Var2.c;
                                            HashSet hashSet = w5Var22.j;
                                            if (hashSet.contains(Long.valueOf(j10))) {
                                                hashSet.remove(Long.valueOf(j10));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = w5Var22.f;
                                                int size = arrayList22.size();
                                                int i172 = 0;
                                                while (i172 < size) {
                                                    Object obj3 = arrayList22.get(i172);
                                                    i172++;
                                                    long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j11 != j10) {
                                                        hashSet.add(Long.valueOf(j11));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j10));
                                            }
                                            w5Var22.h();
                                            f60Var.u();
                                            break;
                                        case 1:
                                            int i182 = ((TL_stars.starGiftAttributeBackdrop) r31Var.G).backdrop_id;
                                            w5 w5Var32 = g6Var2.c;
                                            HashSet hashSet2 = w5Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i182))) {
                                                hashSet2.remove(Integer.valueOf(i182));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = w5Var32.g;
                                                int size2 = arrayList32.size();
                                                int i19 = 0;
                                                while (i19 < size2) {
                                                    Object obj4 = arrayList32.get(i19);
                                                    i19++;
                                                    int i20 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i20 != i182) {
                                                        hashSet2.add(Integer.valueOf(i20));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i182));
                                            }
                                            w5Var32.h();
                                            f60Var.u();
                                            break;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) r31Var.G).document.id;
                                            w5 w5Var4 = g6Var2.c;
                                            HashSet hashSet3 = w5Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j12))) {
                                                hashSet3.remove(Long.valueOf(j12));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = w5Var4.h;
                                                int size3 = arrayList4.size();
                                                int i21 = 0;
                                                while (i21 < size3) {
                                                    Object obj5 = arrayList4.get(i21);
                                                    i21++;
                                                    long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j13 != j12) {
                                                        hashSet3.add(Long.valueOf(j13));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j12));
                                            }
                                            w5Var4.h();
                                            f60Var.u();
                                            break;
                                    }
                                }
                            }, null, h6Var.J0, 4);
                            i5Var.g3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.F8, h6Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, mf.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xs xsVar = new xs(context2, h6Var.J0);
                            xsVar.setTextSize(1, 16.0f);
                            xsVar.setInputType(573441);
                            xsVar.setRawInputType(573441);
                            org.telegram.ui.ActionBar.r6.E(xsVar, org.telegram.ui.ActionBar.k6.A6, h6Var.J0);
                            org.telegram.ui.ActionBar.r6.m(xsVar, 30, org.telegram.ui.ActionBar.k6.G6, h6Var.J0);
                            xsVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            xsVar.setCursorWidth(1.5f);
                            xsVar.setHint(bd.M0(2131750017, null));
                            org.telegram.ui.ActionBar.r6.V(xsVar, org.telegram.ui.ActionBar.k6.E8, h6Var.J0);
                            xsVar.setBackground(null);
                            frameLayout.addView(xsVar, mf.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xsVar.addTextChangedListener(new a0(strArr, i5Var, false, 4));
                            if (arrayList.size() > 8) {
                                f60Var.r(frameLayout, mf.o(-1, 44));
                                f60Var.k();
                            }
                            if (!w5Var.j.isEmpty()) {
                                f60Var.c(R.drawable.msg_select, bd.M0(2131745680, null), new z5(g6Var2, 0), false);
                            }
                            f60Var.q(i5Var);
                            f60Var.Z();
                            break;
                        }
                        break;
                    case 1:
                        w5 w5Var2 = g6Var2.c;
                        if (!w5Var2.g.isEmpty()) {
                            final f60 f60Var2 = new f60(h6Var.c, h6Var.J0, h6Var.V1, false, true, false);
                            f60Var2.t = false;
                            f60Var2.Y = true;
                            f60Var2.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            f60Var2.R = true;
                            f60Var2.p = new g4(f60Var2, 4);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(w5Var2.g);
                            final int i17 = 0;
                            Collections.sort(arrayList2, new Comparator() { // from class: ai.b6
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i17) {
                                        case 0:
                                            g6 g6Var3 = g6Var2;
                                            Integer num = (Integer) g6Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) g6Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            g6 g6Var4 = g6Var2;
                                            Integer num3 = (Integer) g6Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) g6Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            g6 g6Var5 = g6Var2;
                                            Integer num5 = (Integer) g6Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) g6Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i18 = h6Var.a;
                            Context context3 = context;
                            i5 i5Var2 = new i5(context3, i18, 0, false, new n10() { // from class: ai.x5
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.n10
                                public final void a(Object obj, Object obj2) {
                                    int i172 = i13;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    g6 g6Var3 = g6Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i172) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            w5 w5Var22 = g6Var3.c;
                                            boolean isEmpty = w5Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i182 = 0;
                                            while (i182 < size) {
                                                Object obj3 = arrayList22.get(i182);
                                                i182++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = w5Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || k2.p1.z(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) w5Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i19 = q5.b;
                                                    r31 K = r31.K(q5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.l = lowerCase;
                                                    K.z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(m5.i(bd.M0(2131750018, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            w5 w5Var32 = g6Var3.c;
                                            boolean isEmpty2 = w5Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i20 = 0;
                                            while (i20 < size2) {
                                                Object obj4 = arrayList22.get(i20);
                                                i20++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = w5Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || k2.p1.z(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) w5Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i21 = k5.b;
                                                    r31 K2 = r31.K(k5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.l = lowerCase2;
                                                    K2.z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(m5.i(bd.M0(2131750023, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            w5 w5Var4 = g6Var3.c;
                                            boolean isEmpty3 = w5Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size3) {
                                                Object obj5 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = w5Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || k2.p1.z(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) w5Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i23 = t5.b;
                                                    r31 K3 = r31.K(t5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.l = lowerCase3;
                                                    K3.z = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(m5.i(bd.M0(2131750016, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, new s10() { // from class: ai.y5
                                @Override // org.telegram.messenger.s10
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    r31 r31Var = (r31) obj;
                                    switch (i13) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) r31Var.G).document.id;
                                            w5 w5Var22 = g6Var2.c;
                                            HashSet hashSet = w5Var22.j;
                                            if (hashSet.contains(Long.valueOf(j10))) {
                                                hashSet.remove(Long.valueOf(j10));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = w5Var22.f;
                                                int size = arrayList22.size();
                                                int i172 = 0;
                                                while (i172 < size) {
                                                    Object obj3 = arrayList22.get(i172);
                                                    i172++;
                                                    long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j11 != j10) {
                                                        hashSet.add(Long.valueOf(j11));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j10));
                                            }
                                            w5Var22.h();
                                            f60Var2.u();
                                            break;
                                        case 1:
                                            int i182 = ((TL_stars.starGiftAttributeBackdrop) r31Var.G).backdrop_id;
                                            w5 w5Var32 = g6Var2.c;
                                            HashSet hashSet2 = w5Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i182))) {
                                                hashSet2.remove(Integer.valueOf(i182));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = w5Var32.g;
                                                int size2 = arrayList32.size();
                                                int i19 = 0;
                                                while (i19 < size2) {
                                                    Object obj4 = arrayList32.get(i19);
                                                    i19++;
                                                    int i20 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i20 != i182) {
                                                        hashSet2.add(Integer.valueOf(i20));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i182));
                                            }
                                            w5Var32.h();
                                            f60Var2.u();
                                            break;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) r31Var.G).document.id;
                                            w5 w5Var4 = g6Var2.c;
                                            HashSet hashSet3 = w5Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j12))) {
                                                hashSet3.remove(Long.valueOf(j12));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = w5Var4.h;
                                                int size3 = arrayList4.size();
                                                int i21 = 0;
                                                while (i21 < size3) {
                                                    Object obj5 = arrayList4.get(i21);
                                                    i21++;
                                                    long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j13 != j12) {
                                                        hashSet3.add(Long.valueOf(j13));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j12));
                                            }
                                            w5Var4.h();
                                            f60Var2.u();
                                            break;
                                    }
                                }
                            }, null, h6Var.J0, 5);
                            i5Var2.g3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.F8, h6Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, mf.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xs xsVar2 = new xs(context3, h6Var.J0);
                            xsVar2.setTextSize(1, 16.0f);
                            xsVar2.setInputType(573441);
                            xsVar2.setRawInputType(573441);
                            org.telegram.ui.ActionBar.r6.E(xsVar2, org.telegram.ui.ActionBar.k6.A6, h6Var.J0);
                            org.telegram.ui.ActionBar.r6.m(xsVar2, 30, org.telegram.ui.ActionBar.k6.G6, h6Var.J0);
                            xsVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            xsVar2.setCursorWidth(1.5f);
                            xsVar2.setHint(bd.M0(2131750017, null));
                            org.telegram.ui.ActionBar.r6.V(xsVar2, org.telegram.ui.ActionBar.k6.E8, h6Var.J0);
                            xsVar2.setBackground(null);
                            frameLayout2.addView(xsVar2, mf.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xsVar2.addTextChangedListener(new a0(strArr2, i5Var2, false, 5));
                            if (arrayList2.size() > 8) {
                                f60Var2.r(frameLayout2, mf.o(-1, 44));
                                f60Var2.k();
                            }
                            if (!w5Var2.k.isEmpty()) {
                                f60Var2.c(R.drawable.msg_select, bd.M0(2131745680, null), new z5(g6Var2, 1), false);
                            }
                            f60Var2.q(i5Var2);
                            f60Var2.Z();
                            break;
                        }
                        break;
                    default:
                        w5 w5Var3 = g6Var2.c;
                        if (!w5Var3.h.isEmpty()) {
                            final f60 f60Var3 = new f60(h6Var.c, h6Var.J0, h6Var.W1, false, true, false);
                            f60Var3.t = false;
                            f60Var3.Y = true;
                            f60Var3.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            f60Var3.R = true;
                            f60Var3.p = new g4(f60Var3, 5);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(w5Var3.h);
                            Collections.sort(arrayList3, new Comparator() { // from class: ai.b6
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i13) {
                                        case 0:
                                            g6 g6Var3 = g6Var2;
                                            Integer num = (Integer) g6Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) g6Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            g6 g6Var4 = g6Var2;
                                            Integer num3 = (Integer) g6Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) g6Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            g6 g6Var5 = g6Var2;
                                            Integer num5 = (Integer) g6Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) g6Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            Context context4 = context;
                            i5 i5Var3 = new i5(context4, h6Var.a, 0, false, new n10() { // from class: ai.x5
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.n10
                                public final void a(Object obj, Object obj2) {
                                    int i172 = i12;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    g6 g6Var3 = g6Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i172) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            w5 w5Var22 = g6Var3.c;
                                            boolean isEmpty = w5Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i182 = 0;
                                            while (i182 < size) {
                                                Object obj3 = arrayList22.get(i182);
                                                i182++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = w5Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || k2.p1.z(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) w5Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i19 = q5.b;
                                                    r31 K = r31.K(q5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.l = lowerCase;
                                                    K.z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(m5.i(bd.M0(2131750018, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            w5 w5Var32 = g6Var3.c;
                                            boolean isEmpty2 = w5Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i20 = 0;
                                            while (i20 < size2) {
                                                Object obj4 = arrayList22.get(i20);
                                                i20++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = w5Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || k2.p1.z(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) w5Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i21 = k5.b;
                                                    r31 K2 = r31.K(k5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.l = lowerCase2;
                                                    K2.z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(m5.i(bd.M0(2131750023, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            w5 w5Var4 = g6Var3.c;
                                            boolean isEmpty3 = w5Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size3) {
                                                Object obj5 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = w5Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || k2.p1.z(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) w5Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i23 = t5.b;
                                                    r31 K3 = r31.K(t5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.l = lowerCase3;
                                                    K3.z = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(m5.i(bd.M0(2131750016, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, new s10() { // from class: ai.y5
                                @Override // org.telegram.messenger.s10
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    r31 r31Var = (r31) obj;
                                    switch (i12) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) r31Var.G).document.id;
                                            w5 w5Var22 = g6Var2.c;
                                            HashSet hashSet = w5Var22.j;
                                            if (hashSet.contains(Long.valueOf(j10))) {
                                                hashSet.remove(Long.valueOf(j10));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = w5Var22.f;
                                                int size = arrayList22.size();
                                                int i172 = 0;
                                                while (i172 < size) {
                                                    Object obj3 = arrayList22.get(i172);
                                                    i172++;
                                                    long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j11 != j10) {
                                                        hashSet.add(Long.valueOf(j11));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j10));
                                            }
                                            w5Var22.h();
                                            f60Var3.u();
                                            break;
                                        case 1:
                                            int i182 = ((TL_stars.starGiftAttributeBackdrop) r31Var.G).backdrop_id;
                                            w5 w5Var32 = g6Var2.c;
                                            HashSet hashSet2 = w5Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i182))) {
                                                hashSet2.remove(Integer.valueOf(i182));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = w5Var32.g;
                                                int size2 = arrayList32.size();
                                                int i19 = 0;
                                                while (i19 < size2) {
                                                    Object obj4 = arrayList32.get(i19);
                                                    i19++;
                                                    int i20 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i20 != i182) {
                                                        hashSet2.add(Integer.valueOf(i20));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i182));
                                            }
                                            w5Var32.h();
                                            f60Var3.u();
                                            break;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) r31Var.G).document.id;
                                            w5 w5Var4 = g6Var2.c;
                                            HashSet hashSet3 = w5Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j12))) {
                                                hashSet3.remove(Long.valueOf(j12));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = w5Var4.h;
                                                int size3 = arrayList4.size();
                                                int i21 = 0;
                                                while (i21 < size3) {
                                                    Object obj5 = arrayList4.get(i21);
                                                    i21++;
                                                    long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j13 != j12) {
                                                        hashSet3.add(Long.valueOf(j13));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j12));
                                            }
                                            w5Var4.h();
                                            f60Var3.u();
                                            break;
                                    }
                                }
                            }, null, h6Var.J0, 6);
                            i5Var3.g3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.r6.t(imageView3, org.telegram.ui.ActionBar.k6.F8, h6Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, mf.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xs xsVar3 = new xs(context4, h6Var.J0);
                            xsVar3.setTextSize(1, 16.0f);
                            xsVar3.setInputType(573441);
                            xsVar3.setRawInputType(573441);
                            org.telegram.ui.ActionBar.r6.E(xsVar3, org.telegram.ui.ActionBar.k6.A6, h6Var.J0);
                            org.telegram.ui.ActionBar.r6.m(xsVar3, 30, org.telegram.ui.ActionBar.k6.G6, h6Var.J0);
                            xsVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            xsVar3.setCursorWidth(1.5f);
                            xsVar3.setHint(bd.M0(2131750017, null));
                            org.telegram.ui.ActionBar.r6.V(xsVar3, org.telegram.ui.ActionBar.k6.E8, h6Var.J0);
                            xsVar3.setBackground(null);
                            frameLayout3.addView(xsVar3, mf.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xsVar3.addTextChangedListener(new a0(strArr3, i5Var3, false, 6));
                            if (arrayList3.size() > 8) {
                                f60Var3.r(frameLayout3, mf.o(-1, 44));
                                f60Var3.k();
                            }
                            if (!w5Var3.l.isEmpty()) {
                                f60Var3.c(R.drawable.msg_select, bd.M0(2131745680, null), new z5(g6Var2, 2), false);
                            }
                            f60Var3.q(i5Var3);
                            f60Var3.Z();
                            break;
                        }
                        break;
                }
            }
        });
        o5 o5Var4 = new o5(context, this.J0);
        this.W1 = o5Var4;
        o5Var4.setValue(bd.M0(2131750388, null));
        linearLayout.addView(o5Var4, mf.t(-2, -2, 16, 0, 0, 0, 0));
        o5Var4.setOnClickListener(new View.OnClickListener(this) { // from class: ai.e6
            public final /* synthetic */ h6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i3;
                final g6 g6Var2 = g6Var;
                h6 h6Var = this.b;
                final int i12 = 2;
                final int i13 = 1;
                switch (i112) {
                    case 0:
                        w5 w5Var = g6Var2.c;
                        if (!w5Var.f.isEmpty()) {
                            final f60 f60Var = new f60(h6Var.c, h6Var.J0, h6Var.U1, false, true, false);
                            f60Var.t = false;
                            f60Var.Y = true;
                            f60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            f60Var.R = true;
                            f60Var.p = new g4(f60Var, 6);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(w5Var.f);
                            final int i14 = 2;
                            Collections.sort(arrayList, new Comparator() { // from class: ai.b6
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i14) {
                                        case 0:
                                            g6 g6Var3 = g6Var2;
                                            Integer num = (Integer) g6Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) g6Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            g6 g6Var4 = g6Var2;
                                            Integer num3 = (Integer) g6Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) g6Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            g6 g6Var5 = g6Var2;
                                            Integer num5 = (Integer) g6Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) g6Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i15 = h6Var.a;
                            final int i16 = 0;
                            Context context2 = context;
                            i5 i5Var = new i5(context2, i15, 0, false, new n10() { // from class: ai.x5
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.n10
                                public final void a(Object obj, Object obj2) {
                                    int i172 = i16;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList;
                                    g6 g6Var3 = g6Var2;
                                    String[] strArr22 = strArr;
                                    switch (i172) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            w5 w5Var22 = g6Var3.c;
                                            boolean isEmpty = w5Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i182 = 0;
                                            while (i182 < size) {
                                                Object obj3 = arrayList22.get(i182);
                                                i182++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = w5Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || k2.p1.z(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) w5Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i19 = q5.b;
                                                    r31 K = r31.K(q5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.l = lowerCase;
                                                    K.z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(m5.i(bd.M0(2131750018, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            w5 w5Var32 = g6Var3.c;
                                            boolean isEmpty2 = w5Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i20 = 0;
                                            while (i20 < size2) {
                                                Object obj4 = arrayList22.get(i20);
                                                i20++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = w5Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || k2.p1.z(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) w5Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i21 = k5.b;
                                                    r31 K2 = r31.K(k5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.l = lowerCase2;
                                                    K2.z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(m5.i(bd.M0(2131750023, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            w5 w5Var4 = g6Var3.c;
                                            boolean isEmpty3 = w5Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size3) {
                                                Object obj5 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = w5Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || k2.p1.z(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) w5Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i23 = t5.b;
                                                    r31 K3 = r31.K(t5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.l = lowerCase3;
                                                    K3.z = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(m5.i(bd.M0(2131750016, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, new s10() { // from class: ai.y5
                                @Override // org.telegram.messenger.s10
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    r31 r31Var = (r31) obj;
                                    switch (i16) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) r31Var.G).document.id;
                                            w5 w5Var22 = g6Var2.c;
                                            HashSet hashSet = w5Var22.j;
                                            if (hashSet.contains(Long.valueOf(j10))) {
                                                hashSet.remove(Long.valueOf(j10));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = w5Var22.f;
                                                int size = arrayList22.size();
                                                int i172 = 0;
                                                while (i172 < size) {
                                                    Object obj3 = arrayList22.get(i172);
                                                    i172++;
                                                    long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j11 != j10) {
                                                        hashSet.add(Long.valueOf(j11));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j10));
                                            }
                                            w5Var22.h();
                                            f60Var.u();
                                            break;
                                        case 1:
                                            int i182 = ((TL_stars.starGiftAttributeBackdrop) r31Var.G).backdrop_id;
                                            w5 w5Var32 = g6Var2.c;
                                            HashSet hashSet2 = w5Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i182))) {
                                                hashSet2.remove(Integer.valueOf(i182));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = w5Var32.g;
                                                int size2 = arrayList32.size();
                                                int i19 = 0;
                                                while (i19 < size2) {
                                                    Object obj4 = arrayList32.get(i19);
                                                    i19++;
                                                    int i20 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i20 != i182) {
                                                        hashSet2.add(Integer.valueOf(i20));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i182));
                                            }
                                            w5Var32.h();
                                            f60Var.u();
                                            break;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) r31Var.G).document.id;
                                            w5 w5Var4 = g6Var2.c;
                                            HashSet hashSet3 = w5Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j12))) {
                                                hashSet3.remove(Long.valueOf(j12));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = w5Var4.h;
                                                int size3 = arrayList4.size();
                                                int i21 = 0;
                                                while (i21 < size3) {
                                                    Object obj5 = arrayList4.get(i21);
                                                    i21++;
                                                    long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j13 != j12) {
                                                        hashSet3.add(Long.valueOf(j13));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j12));
                                            }
                                            w5Var4.h();
                                            f60Var.u();
                                            break;
                                    }
                                }
                            }, null, h6Var.J0, 4);
                            i5Var.g3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.F8, h6Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, mf.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xs xsVar = new xs(context2, h6Var.J0);
                            xsVar.setTextSize(1, 16.0f);
                            xsVar.setInputType(573441);
                            xsVar.setRawInputType(573441);
                            org.telegram.ui.ActionBar.r6.E(xsVar, org.telegram.ui.ActionBar.k6.A6, h6Var.J0);
                            org.telegram.ui.ActionBar.r6.m(xsVar, 30, org.telegram.ui.ActionBar.k6.G6, h6Var.J0);
                            xsVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            xsVar.setCursorWidth(1.5f);
                            xsVar.setHint(bd.M0(2131750017, null));
                            org.telegram.ui.ActionBar.r6.V(xsVar, org.telegram.ui.ActionBar.k6.E8, h6Var.J0);
                            xsVar.setBackground(null);
                            frameLayout.addView(xsVar, mf.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xsVar.addTextChangedListener(new a0(strArr, i5Var, false, 4));
                            if (arrayList.size() > 8) {
                                f60Var.r(frameLayout, mf.o(-1, 44));
                                f60Var.k();
                            }
                            if (!w5Var.j.isEmpty()) {
                                f60Var.c(R.drawable.msg_select, bd.M0(2131745680, null), new z5(g6Var2, 0), false);
                            }
                            f60Var.q(i5Var);
                            f60Var.Z();
                            break;
                        }
                        break;
                    case 1:
                        w5 w5Var2 = g6Var2.c;
                        if (!w5Var2.g.isEmpty()) {
                            final f60 f60Var2 = new f60(h6Var.c, h6Var.J0, h6Var.V1, false, true, false);
                            f60Var2.t = false;
                            f60Var2.Y = true;
                            f60Var2.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            f60Var2.R = true;
                            f60Var2.p = new g4(f60Var2, 4);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(w5Var2.g);
                            final int i17 = 0;
                            Collections.sort(arrayList2, new Comparator() { // from class: ai.b6
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i17) {
                                        case 0:
                                            g6 g6Var3 = g6Var2;
                                            Integer num = (Integer) g6Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) g6Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            g6 g6Var4 = g6Var2;
                                            Integer num3 = (Integer) g6Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) g6Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            g6 g6Var5 = g6Var2;
                                            Integer num5 = (Integer) g6Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) g6Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i18 = h6Var.a;
                            Context context3 = context;
                            i5 i5Var2 = new i5(context3, i18, 0, false, new n10() { // from class: ai.x5
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.n10
                                public final void a(Object obj, Object obj2) {
                                    int i172 = i13;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    g6 g6Var3 = g6Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i172) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            w5 w5Var22 = g6Var3.c;
                                            boolean isEmpty = w5Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i182 = 0;
                                            while (i182 < size) {
                                                Object obj3 = arrayList22.get(i182);
                                                i182++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = w5Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || k2.p1.z(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) w5Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i19 = q5.b;
                                                    r31 K = r31.K(q5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.l = lowerCase;
                                                    K.z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(m5.i(bd.M0(2131750018, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            w5 w5Var32 = g6Var3.c;
                                            boolean isEmpty2 = w5Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i20 = 0;
                                            while (i20 < size2) {
                                                Object obj4 = arrayList22.get(i20);
                                                i20++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = w5Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || k2.p1.z(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) w5Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i21 = k5.b;
                                                    r31 K2 = r31.K(k5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.l = lowerCase2;
                                                    K2.z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(m5.i(bd.M0(2131750023, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            w5 w5Var4 = g6Var3.c;
                                            boolean isEmpty3 = w5Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size3) {
                                                Object obj5 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = w5Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || k2.p1.z(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) w5Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i23 = t5.b;
                                                    r31 K3 = r31.K(t5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.l = lowerCase3;
                                                    K3.z = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(m5.i(bd.M0(2131750016, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, new s10() { // from class: ai.y5
                                @Override // org.telegram.messenger.s10
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    r31 r31Var = (r31) obj;
                                    switch (i13) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) r31Var.G).document.id;
                                            w5 w5Var22 = g6Var2.c;
                                            HashSet hashSet = w5Var22.j;
                                            if (hashSet.contains(Long.valueOf(j10))) {
                                                hashSet.remove(Long.valueOf(j10));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = w5Var22.f;
                                                int size = arrayList22.size();
                                                int i172 = 0;
                                                while (i172 < size) {
                                                    Object obj3 = arrayList22.get(i172);
                                                    i172++;
                                                    long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j11 != j10) {
                                                        hashSet.add(Long.valueOf(j11));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j10));
                                            }
                                            w5Var22.h();
                                            f60Var2.u();
                                            break;
                                        case 1:
                                            int i182 = ((TL_stars.starGiftAttributeBackdrop) r31Var.G).backdrop_id;
                                            w5 w5Var32 = g6Var2.c;
                                            HashSet hashSet2 = w5Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i182))) {
                                                hashSet2.remove(Integer.valueOf(i182));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = w5Var32.g;
                                                int size2 = arrayList32.size();
                                                int i19 = 0;
                                                while (i19 < size2) {
                                                    Object obj4 = arrayList32.get(i19);
                                                    i19++;
                                                    int i20 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i20 != i182) {
                                                        hashSet2.add(Integer.valueOf(i20));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i182));
                                            }
                                            w5Var32.h();
                                            f60Var2.u();
                                            break;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) r31Var.G).document.id;
                                            w5 w5Var4 = g6Var2.c;
                                            HashSet hashSet3 = w5Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j12))) {
                                                hashSet3.remove(Long.valueOf(j12));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = w5Var4.h;
                                                int size3 = arrayList4.size();
                                                int i21 = 0;
                                                while (i21 < size3) {
                                                    Object obj5 = arrayList4.get(i21);
                                                    i21++;
                                                    long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j13 != j12) {
                                                        hashSet3.add(Long.valueOf(j13));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j12));
                                            }
                                            w5Var4.h();
                                            f60Var2.u();
                                            break;
                                    }
                                }
                            }, null, h6Var.J0, 5);
                            i5Var2.g3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.F8, h6Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, mf.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xs xsVar2 = new xs(context3, h6Var.J0);
                            xsVar2.setTextSize(1, 16.0f);
                            xsVar2.setInputType(573441);
                            xsVar2.setRawInputType(573441);
                            org.telegram.ui.ActionBar.r6.E(xsVar2, org.telegram.ui.ActionBar.k6.A6, h6Var.J0);
                            org.telegram.ui.ActionBar.r6.m(xsVar2, 30, org.telegram.ui.ActionBar.k6.G6, h6Var.J0);
                            xsVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            xsVar2.setCursorWidth(1.5f);
                            xsVar2.setHint(bd.M0(2131750017, null));
                            org.telegram.ui.ActionBar.r6.V(xsVar2, org.telegram.ui.ActionBar.k6.E8, h6Var.J0);
                            xsVar2.setBackground(null);
                            frameLayout2.addView(xsVar2, mf.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xsVar2.addTextChangedListener(new a0(strArr2, i5Var2, false, 5));
                            if (arrayList2.size() > 8) {
                                f60Var2.r(frameLayout2, mf.o(-1, 44));
                                f60Var2.k();
                            }
                            if (!w5Var2.k.isEmpty()) {
                                f60Var2.c(R.drawable.msg_select, bd.M0(2131745680, null), new z5(g6Var2, 1), false);
                            }
                            f60Var2.q(i5Var2);
                            f60Var2.Z();
                            break;
                        }
                        break;
                    default:
                        w5 w5Var3 = g6Var2.c;
                        if (!w5Var3.h.isEmpty()) {
                            final f60 f60Var3 = new f60(h6Var.c, h6Var.J0, h6Var.W1, false, true, false);
                            f60Var3.t = false;
                            f60Var3.Y = true;
                            f60Var3.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            f60Var3.R = true;
                            f60Var3.p = new g4(f60Var3, 5);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(w5Var3.h);
                            Collections.sort(arrayList3, new Comparator() { // from class: ai.b6
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i13) {
                                        case 0:
                                            g6 g6Var3 = g6Var2;
                                            Integer num = (Integer) g6Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) g6Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            g6 g6Var4 = g6Var2;
                                            Integer num3 = (Integer) g6Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) g6Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            g6 g6Var5 = g6Var2;
                                            Integer num5 = (Integer) g6Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) g6Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            Context context4 = context;
                            i5 i5Var3 = new i5(context4, h6Var.a, 0, false, new n10() { // from class: ai.x5
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.n10
                                public final void a(Object obj, Object obj2) {
                                    int i172 = i12;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    g6 g6Var3 = g6Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i172) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            w5 w5Var22 = g6Var3.c;
                                            boolean isEmpty = w5Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i182 = 0;
                                            while (i182 < size) {
                                                Object obj3 = arrayList22.get(i182);
                                                i182++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = w5Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || k2.p1.z(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) w5Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i19 = q5.b;
                                                    r31 K = r31.K(q5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.l = lowerCase;
                                                    K.z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(m5.i(bd.M0(2131750018, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            w5 w5Var32 = g6Var3.c;
                                            boolean isEmpty2 = w5Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i20 = 0;
                                            while (i20 < size2) {
                                                Object obj4 = arrayList22.get(i20);
                                                i20++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = w5Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || k2.p1.z(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) w5Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i21 = k5.b;
                                                    r31 K2 = r31.K(k5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.l = lowerCase2;
                                                    K2.z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(m5.i(bd.M0(2131750023, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            w5 w5Var4 = g6Var3.c;
                                            boolean isEmpty3 = w5Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size3) {
                                                Object obj5 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = w5Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || k2.p1.z(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) w5Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i23 = t5.b;
                                                    r31 K3 = r31.K(t5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.l = lowerCase3;
                                                    K3.z = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(m5.i(bd.M0(2131750016, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, new s10() { // from class: ai.y5
                                @Override // org.telegram.messenger.s10
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    r31 r31Var = (r31) obj;
                                    switch (i12) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) r31Var.G).document.id;
                                            w5 w5Var22 = g6Var2.c;
                                            HashSet hashSet = w5Var22.j;
                                            if (hashSet.contains(Long.valueOf(j10))) {
                                                hashSet.remove(Long.valueOf(j10));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = w5Var22.f;
                                                int size = arrayList22.size();
                                                int i172 = 0;
                                                while (i172 < size) {
                                                    Object obj3 = arrayList22.get(i172);
                                                    i172++;
                                                    long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j11 != j10) {
                                                        hashSet.add(Long.valueOf(j11));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j10));
                                            }
                                            w5Var22.h();
                                            f60Var3.u();
                                            break;
                                        case 1:
                                            int i182 = ((TL_stars.starGiftAttributeBackdrop) r31Var.G).backdrop_id;
                                            w5 w5Var32 = g6Var2.c;
                                            HashSet hashSet2 = w5Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i182))) {
                                                hashSet2.remove(Integer.valueOf(i182));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = w5Var32.g;
                                                int size2 = arrayList32.size();
                                                int i19 = 0;
                                                while (i19 < size2) {
                                                    Object obj4 = arrayList32.get(i19);
                                                    i19++;
                                                    int i20 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i20 != i182) {
                                                        hashSet2.add(Integer.valueOf(i20));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i182));
                                            }
                                            w5Var32.h();
                                            f60Var3.u();
                                            break;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) r31Var.G).document.id;
                                            w5 w5Var4 = g6Var2.c;
                                            HashSet hashSet3 = w5Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j12))) {
                                                hashSet3.remove(Long.valueOf(j12));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = w5Var4.h;
                                                int size3 = arrayList4.size();
                                                int i21 = 0;
                                                while (i21 < size3) {
                                                    Object obj5 = arrayList4.get(i21);
                                                    i21++;
                                                    long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j13 != j12) {
                                                        hashSet3.add(Long.valueOf(j13));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j12));
                                            }
                                            w5Var4.h();
                                            f60Var3.u();
                                            break;
                                    }
                                }
                            }, null, h6Var.J0, 6);
                            i5Var3.g3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.r6.t(imageView3, org.telegram.ui.ActionBar.k6.F8, h6Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, mf.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xs xsVar3 = new xs(context4, h6Var.J0);
                            xsVar3.setTextSize(1, 16.0f);
                            xsVar3.setInputType(573441);
                            xsVar3.setRawInputType(573441);
                            org.telegram.ui.ActionBar.r6.E(xsVar3, org.telegram.ui.ActionBar.k6.A6, h6Var.J0);
                            org.telegram.ui.ActionBar.r6.m(xsVar3, 30, org.telegram.ui.ActionBar.k6.G6, h6Var.J0);
                            xsVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            xsVar3.setCursorWidth(1.5f);
                            xsVar3.setHint(bd.M0(2131750017, null));
                            org.telegram.ui.ActionBar.r6.V(xsVar3, org.telegram.ui.ActionBar.k6.E8, h6Var.J0);
                            xsVar3.setBackground(null);
                            frameLayout3.addView(xsVar3, mf.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xsVar3.addTextChangedListener(new a0(strArr3, i5Var3, false, 6));
                            if (arrayList3.size() > 8) {
                                f60Var3.r(frameLayout3, mf.o(-1, 44));
                                f60Var3.k();
                            }
                            if (!w5Var3.l.isEmpty()) {
                                f60Var3.c(R.drawable.msg_select, bd.M0(2131745680, null), new z5(g6Var2, 2), false);
                            }
                            f60Var3.q(i5Var3);
                            f60Var3.Z();
                            break;
                        }
                        break;
                }
            }
        });
        getContext();
        u4.s sVar = new u4.s(3);
        sVar.O = new g2(this, i11);
        this.l1.setLayoutManager(sVar);
        this.l1.setOnItemClickListener(new n(4, this, g6Var));
        this.l1.setPadding(org.telegram.messenger.g0.L(8.0f) + this.u0, 0, org.telegram.messenger.g0.L(8.0f) + this.u0, 0);
        this.l1.setOnScrollListener(new j5(this, i11));
        u4.k kVar = new u4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.l1.setItemAnimator(kVar);
        this.l1.setItemSelectorColorProvider(new a3.j(4));
        ci.q4 q4Var = new ci.q4(context);
        this.X1 = q4Var;
        int L = org.telegram.messenger.g0.L(20.0f);
        int L2 = org.telegram.messenger.g0.L(9.0f);
        q4Var.h = L;
        q4Var.n = L2;
        q4Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
        q4Var.setFullRect(true);
        org.telegram.messenger.g0.m2(new v2(q4Var, 10), 12.0f, 12, new ArrayList());
        q4Var.setPivotY(0.0f);
        this.c.addView(q4Var, mf.e(-1, -2, 55));
        this.b2.O(false);
        g6Var.d = new a6(this, i11);
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        f6 f6Var = new f6(this, tj0Var, getContext(), this.a, new c(this, 8), this.J0, 0);
        this.b2 = f6Var;
        return f6Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        String str = this.Q1;
        return str != null ? str : bd.M0(2131749779, null);
    }

    @Override // org.telegram.ui.Components.ma
    public final void T0(float f10) {
        float y9 = this.b.getY() + f10;
        ci.q4 q4Var = this.X1;
        float measuredHeight = y9 - q4Var.getMeasuredHeight();
        float l10 = 1.0f - Utilities.l(Math.max(0.0f, (-measuredHeight) + org.telegram.messenger.g0.L(8.0f)) / q4Var.getMeasuredHeight());
        float height = this.c.getHeight() / 2.0f;
        if (measuredHeight > height) {
            l10 = Math.min(l10, Utilities.l(1.0f - ((measuredHeight - height) / org.telegram.messenger.g0.N(128.0f))));
        }
        q4Var.setScaleX(l10);
        q4Var.setScaleY(l10);
        q4Var.setAlpha(org.telegram.messenger.g0.z1(l10, 0.5f, 1.0f));
        q4Var.setTranslationY(measuredHeight);
    }

    public final void d1() {
        int R;
        r31 G;
        int i3 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            tj0 tj0Var = this.l1;
            if (i3 >= tj0Var.getChildCount()) {
                break;
            }
            View childAt = tj0Var.getChildAt(i3);
            if ((childAt instanceof iz) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.b2.G(R)) != null) {
                if (G.d < 10) {
                    z10 = true;
                } else {
                    z11 = true;
                }
            }
            i3++;
        }
        g6 g6Var = this.R1;
        if (z10) {
            g6Var.b.a();
        }
        if (z11) {
            g6Var.c.g(false);
        }
    }
}
