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
import c8.ma;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.y60;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class g8 extends sa {
    public static final /* synthetic */ int g2 = 0;
    public final String T1;
    public final f8 U1;
    public final HorizontalScrollView V1;
    public final m7 W1;
    public final m7 X1;
    public final m7 Y1;
    public final m7 Z1;
    public final di.k4 a2;
    public di.c2 b2;
    public final HashSet c2;
    public boolean d2;
    public e8 e2;
    public boolean f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(final Context context, String str, final f8 f8Var) {
        super(2, context, (org.telegram.ui.ActionBar.i6) null, false);
        final int i7 = 2;
        final int i10 = 0;
        this.c2 = new HashSet();
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        O();
        this.T1 = str;
        this.U1 = f8Var;
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
        m7 m7Var = new m7(context, this.J0, false);
        this.W1 = m7Var;
        m7Var.setSorting(f8Var.c.p);
        linearLayout.addView(m7Var, ma.t(-2, -2, 16, 0, 0, 6, 0));
        m7Var.setOnClickListener(new ai.v2(7, this, f8Var));
        m7 m7Var2 = new m7(context, this.J0, false);
        this.X1 = m7Var2;
        m7Var2.setValue(gd.M0(2131750371, null));
        linearLayout.addView(m7Var2, ma.t(-2, -2, 16, 0, 0, 6, 0));
        m7Var2.setOnClickListener(new View.OnClickListener(this) { // from class: bi.d8
            public final /* synthetic */ g8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                final f8 f8Var2 = f8Var;
                g8 g8Var = this.b;
                final int i12 = 2;
                final int i13 = 1;
                switch (i11) {
                    case 0:
                        v7 v7Var = f8Var2.c;
                        if (!v7Var.f.isEmpty()) {
                            final y60 y60Var = new y60(g8Var.c, g8Var.J0, g8Var.X1, false, true, false);
                            y60Var.t = false;
                            y60Var.b0 = true;
                            y60Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            y60Var.U = true;
                            y60Var.p = new c6(y60Var, 6);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(v7Var.f);
                            final int i14 = 2;
                            Collections.sort(arrayList, new Comparator() { // from class: bi.a8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i14) {
                                        case 0:
                                            f8 f8Var3 = f8Var2;
                                            Integer num = (Integer) f8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) f8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            f8 f8Var4 = f8Var2;
                                            Integer num3 = (Integer) f8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) f8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            f8 f8Var5 = f8Var2;
                                            Integer num5 = (Integer) f8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) f8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i15 = g8Var.a;
                            final int i16 = 0;
                            q10 q10Var = new q10() { // from class: bi.w7
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.q10
                                public final void a(Object obj, Object obj2) {
                                    int i17 = i16;
                                    boolean z10 = false;
                                    ArrayList arrayList2 = arrayList;
                                    f8 f8Var3 = f8Var2;
                                    String[] strArr2 = strArr;
                                    switch (i17) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            String lowerCase = strArr2[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            v7 v7Var2 = f8Var3.c;
                                            boolean isEmpty = v7Var2.j.isEmpty();
                                            int size = arrayList2.size();
                                            int i18 = 0;
                                            while (i18 < size) {
                                                Object obj3 = arrayList2.get(i18);
                                                i18++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = v7Var2.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) v7Var2.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i19 = p7.b;
                                                    l41 K = l41.K(p7.class);
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
                                                arrayList3.add(k7.i(gd.M0(2131749994, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr2[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            v7 v7Var3 = f8Var3.c;
                                            boolean isEmpty2 = v7Var3.k.isEmpty();
                                            int size2 = arrayList2.size();
                                            int i20 = 0;
                                            while (i20 < size2) {
                                                Object obj4 = arrayList2.get(i20);
                                                i20++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = v7Var3.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) v7Var3.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i21 = h7.b;
                                                    l41 K2 = l41.K(h7.class);
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
                                                arrayList4.add(k7.i(gd.M0(2131749999, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr2[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            v7 v7Var4 = f8Var3.c;
                                            boolean isEmpty3 = v7Var4.l.isEmpty();
                                            int size3 = arrayList2.size();
                                            int i22 = 0;
                                            while (i22 < size3) {
                                                Object obj5 = arrayList2.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = v7Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) v7Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i23 = s7.b;
                                                    l41 K3 = l41.K(s7.class);
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
                                                arrayList5.add(k7.i(gd.M0(2131749992, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            v10 v10Var = new v10() { // from class: bi.x7
                                @Override // org.telegram.messenger.v10
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    l41 l41Var = (l41) obj;
                                    switch (i16) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) l41Var.H).document.id;
                                            v7 v7Var2 = f8Var2.c;
                                            HashSet hashSet = v7Var2.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList2 = v7Var2.f;
                                                int size = arrayList2.size();
                                                int i17 = 0;
                                                while (i17 < size) {
                                                    Object obj3 = arrayList2.get(i17);
                                                    i17++;
                                                    long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j10 != j3) {
                                                        hashSet.add(Long.valueOf(j10));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j3));
                                            }
                                            v7Var2.m();
                                            y60Var.v();
                                            break;
                                        case 1:
                                            int i18 = ((TL_stars.starGiftAttributeBackdrop) l41Var.H).backdrop_id;
                                            v7 v7Var3 = f8Var2.c;
                                            HashSet hashSet2 = v7Var3.k;
                                            if (hashSet2.contains(Integer.valueOf(i18))) {
                                                hashSet2.remove(Integer.valueOf(i18));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList3 = v7Var3.g;
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
                                            v7Var3.m();
                                            y60Var.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) l41Var.H).document.id;
                                            v7 v7Var4 = f8Var2.c;
                                            HashSet hashSet3 = v7Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = v7Var4.h;
                                                int size3 = arrayList4.size();
                                                int i21 = 0;
                                                while (i21 < size3) {
                                                    Object obj5 = arrayList4.get(i21);
                                                    i21++;
                                                    long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j12 != j11) {
                                                        hashSet3.add(Long.valueOf(j12));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j11));
                                            }
                                            v7Var4.m();
                                            y60Var.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var = g8Var.J0;
                            Context context2 = context;
                            g7 g7Var = new g7(context2, i15, 0, false, q10Var, v10Var, null, i6Var, 4);
                            g7Var.g3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.F8, g8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar = new mt(context2, g8Var.J0);
                            mtVar.setTextSize(1, 16.0f);
                            mtVar.setInputType(573441);
                            mtVar.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar, org.telegram.ui.ActionBar.n6.A6, g8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar, 30, org.telegram.ui.ActionBar.n6.G6, g8Var.J0);
                            mtVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar.setCursorWidth(1.5f);
                            mtVar.setHint(gd.M0(2131749993, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar, org.telegram.ui.ActionBar.n6.E8, g8Var.J0);
                            mtVar.setBackground(null);
                            frameLayout.addView(mtVar, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar.addTextChangedListener(new v(strArr, g7Var, false, 4));
                            if (arrayList.size() > 8) {
                                y60Var.r(frameLayout, ma.o(-1, 44));
                                y60Var.k();
                            }
                            if (!v7Var.j.isEmpty()) {
                                y60Var.c(R.drawable.msg_select, gd.M0(2131745475, null), new y7(f8Var2, 0), false);
                            }
                            y60Var.q(g7Var);
                            y60Var.a0();
                            break;
                        }
                        break;
                    case 1:
                        v7 v7Var2 = f8Var2.c;
                        if (!v7Var2.g.isEmpty()) {
                            final y60 y60Var2 = new y60(g8Var.c, g8Var.J0, g8Var.Y1, false, true, false);
                            y60Var2.t = false;
                            y60Var2.b0 = true;
                            y60Var2.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            y60Var2.U = true;
                            y60Var2.p = new c6(y60Var2, 4);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(v7Var2.g);
                            final int i17 = 0;
                            Collections.sort(arrayList2, new Comparator() { // from class: bi.a8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i17) {
                                        case 0:
                                            f8 f8Var3 = f8Var2;
                                            Integer num = (Integer) f8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) f8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            f8 f8Var4 = f8Var2;
                                            Integer num3 = (Integer) f8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) f8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            f8 f8Var5 = f8Var2;
                                            Integer num5 = (Integer) f8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) f8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i18 = g8Var.a;
                            q10 q10Var2 = new q10() { // from class: bi.w7
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.q10
                                public final void a(Object obj, Object obj2) {
                                    int i172 = i13;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    f8 f8Var3 = f8Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i172) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            v7 v7Var22 = f8Var3.c;
                                            boolean isEmpty = v7Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i182 = 0;
                                            while (i182 < size) {
                                                Object obj3 = arrayList22.get(i182);
                                                i182++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = v7Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) v7Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i19 = p7.b;
                                                    l41 K = l41.K(p7.class);
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
                                                arrayList3.add(k7.i(gd.M0(2131749994, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            v7 v7Var3 = f8Var3.c;
                                            boolean isEmpty2 = v7Var3.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i20 = 0;
                                            while (i20 < size2) {
                                                Object obj4 = arrayList22.get(i20);
                                                i20++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = v7Var3.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) v7Var3.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i21 = h7.b;
                                                    l41 K2 = l41.K(h7.class);
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
                                                arrayList4.add(k7.i(gd.M0(2131749999, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            v7 v7Var4 = f8Var3.c;
                                            boolean isEmpty3 = v7Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size3) {
                                                Object obj5 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = v7Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) v7Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i23 = s7.b;
                                                    l41 K3 = l41.K(s7.class);
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
                                                arrayList5.add(k7.i(gd.M0(2131749992, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            v10 v10Var2 = new v10() { // from class: bi.x7
                                @Override // org.telegram.messenger.v10
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    l41 l41Var = (l41) obj;
                                    switch (i13) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) l41Var.H).document.id;
                                            v7 v7Var22 = f8Var2.c;
                                            HashSet hashSet = v7Var22.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = v7Var22.f;
                                                int size = arrayList22.size();
                                                int i172 = 0;
                                                while (i172 < size) {
                                                    Object obj3 = arrayList22.get(i172);
                                                    i172++;
                                                    long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j10 != j3) {
                                                        hashSet.add(Long.valueOf(j10));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j3));
                                            }
                                            v7Var22.m();
                                            y60Var2.v();
                                            break;
                                        case 1:
                                            int i182 = ((TL_stars.starGiftAttributeBackdrop) l41Var.H).backdrop_id;
                                            v7 v7Var3 = f8Var2.c;
                                            HashSet hashSet2 = v7Var3.k;
                                            if (hashSet2.contains(Integer.valueOf(i182))) {
                                                hashSet2.remove(Integer.valueOf(i182));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList3 = v7Var3.g;
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
                                            v7Var3.m();
                                            y60Var2.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) l41Var.H).document.id;
                                            v7 v7Var4 = f8Var2.c;
                                            HashSet hashSet3 = v7Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = v7Var4.h;
                                                int size3 = arrayList4.size();
                                                int i21 = 0;
                                                while (i21 < size3) {
                                                    Object obj5 = arrayList4.get(i21);
                                                    i21++;
                                                    long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j12 != j11) {
                                                        hashSet3.add(Long.valueOf(j12));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j11));
                                            }
                                            v7Var4.m();
                                            y60Var2.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var2 = g8Var.J0;
                            Context context3 = context;
                            g7 g7Var2 = new g7(context3, i18, 0, false, q10Var2, v10Var2, null, i6Var2, 5);
                            g7Var2.g3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.F8, g8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar2 = new mt(context3, g8Var.J0);
                            mtVar2.setTextSize(1, 16.0f);
                            mtVar2.setInputType(573441);
                            mtVar2.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar2, org.telegram.ui.ActionBar.n6.A6, g8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar2, 30, org.telegram.ui.ActionBar.n6.G6, g8Var.J0);
                            mtVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar2.setCursorWidth(1.5f);
                            mtVar2.setHint(gd.M0(2131749993, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar2, org.telegram.ui.ActionBar.n6.E8, g8Var.J0);
                            mtVar2.setBackground(null);
                            frameLayout2.addView(mtVar2, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar2.addTextChangedListener(new v(strArr2, g7Var2, false, 5));
                            if (arrayList2.size() > 8) {
                                y60Var2.r(frameLayout2, ma.o(-1, 44));
                                y60Var2.k();
                            }
                            if (!v7Var2.k.isEmpty()) {
                                y60Var2.c(R.drawable.msg_select, gd.M0(2131745475, null), new y7(f8Var2, 1), false);
                            }
                            y60Var2.q(g7Var2);
                            y60Var2.a0();
                            break;
                        }
                        break;
                    default:
                        v7 v7Var3 = f8Var2.c;
                        if (!v7Var3.h.isEmpty()) {
                            final y60 y60Var3 = new y60(g8Var.c, g8Var.J0, g8Var.Z1, false, true, false);
                            y60Var3.t = false;
                            y60Var3.b0 = true;
                            y60Var3.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            y60Var3.U = true;
                            y60Var3.p = new c6(y60Var3, 5);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(v7Var3.h);
                            Collections.sort(arrayList3, new Comparator() { // from class: bi.a8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i13) {
                                        case 0:
                                            f8 f8Var3 = f8Var2;
                                            Integer num = (Integer) f8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) f8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            f8 f8Var4 = f8Var2;
                                            Integer num3 = (Integer) f8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) f8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            f8 f8Var5 = f8Var2;
                                            Integer num5 = (Integer) f8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) f8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i19 = g8Var.a;
                            q10 q10Var3 = new q10() { // from class: bi.w7
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.q10
                                public final void a(Object obj, Object obj2) {
                                    int i172 = i12;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    f8 f8Var3 = f8Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i172) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            v7 v7Var22 = f8Var3.c;
                                            boolean isEmpty = v7Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i182 = 0;
                                            while (i182 < size) {
                                                Object obj3 = arrayList22.get(i182);
                                                i182++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = v7Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) v7Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i192 = p7.b;
                                                    l41 K = l41.K(p7.class);
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
                                                arrayList32.add(k7.i(gd.M0(2131749994, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            v7 v7Var32 = f8Var3.c;
                                            boolean isEmpty2 = v7Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i20 = 0;
                                            while (i20 < size2) {
                                                Object obj4 = arrayList22.get(i20);
                                                i20++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = v7Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) v7Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i21 = h7.b;
                                                    l41 K2 = l41.K(h7.class);
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
                                                arrayList4.add(k7.i(gd.M0(2131749999, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            v7 v7Var4 = f8Var3.c;
                                            boolean isEmpty3 = v7Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size3) {
                                                Object obj5 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = v7Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) v7Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i23 = s7.b;
                                                    l41 K3 = l41.K(s7.class);
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
                                                arrayList5.add(k7.i(gd.M0(2131749992, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            v10 v10Var3 = new v10() { // from class: bi.x7
                                @Override // org.telegram.messenger.v10
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    l41 l41Var = (l41) obj;
                                    switch (i12) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) l41Var.H).document.id;
                                            v7 v7Var22 = f8Var2.c;
                                            HashSet hashSet = v7Var22.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = v7Var22.f;
                                                int size = arrayList22.size();
                                                int i172 = 0;
                                                while (i172 < size) {
                                                    Object obj3 = arrayList22.get(i172);
                                                    i172++;
                                                    long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j10 != j3) {
                                                        hashSet.add(Long.valueOf(j10));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j3));
                                            }
                                            v7Var22.m();
                                            y60Var3.v();
                                            break;
                                        case 1:
                                            int i182 = ((TL_stars.starGiftAttributeBackdrop) l41Var.H).backdrop_id;
                                            v7 v7Var32 = f8Var2.c;
                                            HashSet hashSet2 = v7Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i182))) {
                                                hashSet2.remove(Integer.valueOf(i182));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = v7Var32.g;
                                                int size2 = arrayList32.size();
                                                int i192 = 0;
                                                while (i192 < size2) {
                                                    Object obj4 = arrayList32.get(i192);
                                                    i192++;
                                                    int i20 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i20 != i182) {
                                                        hashSet2.add(Integer.valueOf(i20));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i182));
                                            }
                                            v7Var32.m();
                                            y60Var3.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) l41Var.H).document.id;
                                            v7 v7Var4 = f8Var2.c;
                                            HashSet hashSet3 = v7Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = v7Var4.h;
                                                int size3 = arrayList4.size();
                                                int i21 = 0;
                                                while (i21 < size3) {
                                                    Object obj5 = arrayList4.get(i21);
                                                    i21++;
                                                    long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j12 != j11) {
                                                        hashSet3.add(Long.valueOf(j12));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j11));
                                            }
                                            v7Var4.m();
                                            y60Var3.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var3 = g8Var.J0;
                            Context context4 = context;
                            g7 g7Var3 = new g7(context4, i19, 0, false, q10Var3, v10Var3, null, i6Var3, 6);
                            g7Var3.g3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.u6.s(imageView3, org.telegram.ui.ActionBar.n6.F8, g8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar3 = new mt(context4, g8Var.J0);
                            mtVar3.setTextSize(1, 16.0f);
                            mtVar3.setInputType(573441);
                            mtVar3.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar3, org.telegram.ui.ActionBar.n6.A6, g8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar3, 30, org.telegram.ui.ActionBar.n6.G6, g8Var.J0);
                            mtVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar3.setCursorWidth(1.5f);
                            mtVar3.setHint(gd.M0(2131749993, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar3, org.telegram.ui.ActionBar.n6.E8, g8Var.J0);
                            mtVar3.setBackground(null);
                            frameLayout3.addView(mtVar3, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar3.addTextChangedListener(new v(strArr3, g7Var3, false, 6));
                            if (arrayList3.size() > 8) {
                                y60Var3.r(frameLayout3, ma.o(-1, 44));
                                y60Var3.k();
                            }
                            if (!v7Var3.l.isEmpty()) {
                                y60Var3.c(R.drawable.msg_select, gd.M0(2131745475, null), new y7(f8Var2, 2), false);
                            }
                            y60Var3.q(g7Var3);
                            y60Var3.a0();
                            break;
                        }
                        break;
                }
            }
        });
        m7 m7Var3 = new m7(context, this.J0, false);
        this.Y1 = m7Var3;
        m7Var3.setValue(gd.M0(2131750372, null));
        linearLayout.addView(m7Var3, ma.t(-2, -2, 16, 0, 0, 6, 0));
        final int i11 = 1;
        m7Var3.setOnClickListener(new View.OnClickListener(this) { // from class: bi.d8
            public final /* synthetic */ g8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                final f8 f8Var2 = f8Var;
                g8 g8Var = this.b;
                final int i12 = 2;
                final int i13 = 1;
                switch (i112) {
                    case 0:
                        v7 v7Var = f8Var2.c;
                        if (!v7Var.f.isEmpty()) {
                            final y60 y60Var = new y60(g8Var.c, g8Var.J0, g8Var.X1, false, true, false);
                            y60Var.t = false;
                            y60Var.b0 = true;
                            y60Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            y60Var.U = true;
                            y60Var.p = new c6(y60Var, 6);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(v7Var.f);
                            final int i14 = 2;
                            Collections.sort(arrayList, new Comparator() { // from class: bi.a8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i14) {
                                        case 0:
                                            f8 f8Var3 = f8Var2;
                                            Integer num = (Integer) f8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) f8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            f8 f8Var4 = f8Var2;
                                            Integer num3 = (Integer) f8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) f8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            f8 f8Var5 = f8Var2;
                                            Integer num5 = (Integer) f8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) f8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i15 = g8Var.a;
                            final int i16 = 0;
                            q10 q10Var = new q10() { // from class: bi.w7
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.q10
                                public final void a(Object obj, Object obj2) {
                                    int i172 = i16;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList;
                                    f8 f8Var3 = f8Var2;
                                    String[] strArr22 = strArr;
                                    switch (i172) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            v7 v7Var22 = f8Var3.c;
                                            boolean isEmpty = v7Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i182 = 0;
                                            while (i182 < size) {
                                                Object obj3 = arrayList22.get(i182);
                                                i182++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = v7Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) v7Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i192 = p7.b;
                                                    l41 K = l41.K(p7.class);
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
                                                arrayList32.add(k7.i(gd.M0(2131749994, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            v7 v7Var32 = f8Var3.c;
                                            boolean isEmpty2 = v7Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i20 = 0;
                                            while (i20 < size2) {
                                                Object obj4 = arrayList22.get(i20);
                                                i20++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = v7Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) v7Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i21 = h7.b;
                                                    l41 K2 = l41.K(h7.class);
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
                                                arrayList4.add(k7.i(gd.M0(2131749999, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            v7 v7Var4 = f8Var3.c;
                                            boolean isEmpty3 = v7Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size3) {
                                                Object obj5 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = v7Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) v7Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i23 = s7.b;
                                                    l41 K3 = l41.K(s7.class);
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
                                                arrayList5.add(k7.i(gd.M0(2131749992, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            v10 v10Var = new v10() { // from class: bi.x7
                                @Override // org.telegram.messenger.v10
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    l41 l41Var = (l41) obj;
                                    switch (i16) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) l41Var.H).document.id;
                                            v7 v7Var22 = f8Var2.c;
                                            HashSet hashSet = v7Var22.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = v7Var22.f;
                                                int size = arrayList22.size();
                                                int i172 = 0;
                                                while (i172 < size) {
                                                    Object obj3 = arrayList22.get(i172);
                                                    i172++;
                                                    long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j10 != j3) {
                                                        hashSet.add(Long.valueOf(j10));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j3));
                                            }
                                            v7Var22.m();
                                            y60Var.v();
                                            break;
                                        case 1:
                                            int i182 = ((TL_stars.starGiftAttributeBackdrop) l41Var.H).backdrop_id;
                                            v7 v7Var32 = f8Var2.c;
                                            HashSet hashSet2 = v7Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i182))) {
                                                hashSet2.remove(Integer.valueOf(i182));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = v7Var32.g;
                                                int size2 = arrayList32.size();
                                                int i192 = 0;
                                                while (i192 < size2) {
                                                    Object obj4 = arrayList32.get(i192);
                                                    i192++;
                                                    int i20 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i20 != i182) {
                                                        hashSet2.add(Integer.valueOf(i20));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i182));
                                            }
                                            v7Var32.m();
                                            y60Var.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) l41Var.H).document.id;
                                            v7 v7Var4 = f8Var2.c;
                                            HashSet hashSet3 = v7Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = v7Var4.h;
                                                int size3 = arrayList4.size();
                                                int i21 = 0;
                                                while (i21 < size3) {
                                                    Object obj5 = arrayList4.get(i21);
                                                    i21++;
                                                    long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j12 != j11) {
                                                        hashSet3.add(Long.valueOf(j12));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j11));
                                            }
                                            v7Var4.m();
                                            y60Var.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var = g8Var.J0;
                            Context context2 = context;
                            g7 g7Var = new g7(context2, i15, 0, false, q10Var, v10Var, null, i6Var, 4);
                            g7Var.g3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.F8, g8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar = new mt(context2, g8Var.J0);
                            mtVar.setTextSize(1, 16.0f);
                            mtVar.setInputType(573441);
                            mtVar.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar, org.telegram.ui.ActionBar.n6.A6, g8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar, 30, org.telegram.ui.ActionBar.n6.G6, g8Var.J0);
                            mtVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar.setCursorWidth(1.5f);
                            mtVar.setHint(gd.M0(2131749993, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar, org.telegram.ui.ActionBar.n6.E8, g8Var.J0);
                            mtVar.setBackground(null);
                            frameLayout.addView(mtVar, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar.addTextChangedListener(new v(strArr, g7Var, false, 4));
                            if (arrayList.size() > 8) {
                                y60Var.r(frameLayout, ma.o(-1, 44));
                                y60Var.k();
                            }
                            if (!v7Var.j.isEmpty()) {
                                y60Var.c(R.drawable.msg_select, gd.M0(2131745475, null), new y7(f8Var2, 0), false);
                            }
                            y60Var.q(g7Var);
                            y60Var.a0();
                            break;
                        }
                        break;
                    case 1:
                        v7 v7Var2 = f8Var2.c;
                        if (!v7Var2.g.isEmpty()) {
                            final y60 y60Var2 = new y60(g8Var.c, g8Var.J0, g8Var.Y1, false, true, false);
                            y60Var2.t = false;
                            y60Var2.b0 = true;
                            y60Var2.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            y60Var2.U = true;
                            y60Var2.p = new c6(y60Var2, 4);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(v7Var2.g);
                            final int i17 = 0;
                            Collections.sort(arrayList2, new Comparator() { // from class: bi.a8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i17) {
                                        case 0:
                                            f8 f8Var3 = f8Var2;
                                            Integer num = (Integer) f8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) f8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            f8 f8Var4 = f8Var2;
                                            Integer num3 = (Integer) f8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) f8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            f8 f8Var5 = f8Var2;
                                            Integer num5 = (Integer) f8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) f8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i18 = g8Var.a;
                            q10 q10Var2 = new q10() { // from class: bi.w7
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.q10
                                public final void a(Object obj, Object obj2) {
                                    int i172 = i13;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    f8 f8Var3 = f8Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i172) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            v7 v7Var22 = f8Var3.c;
                                            boolean isEmpty = v7Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i182 = 0;
                                            while (i182 < size) {
                                                Object obj3 = arrayList22.get(i182);
                                                i182++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = v7Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) v7Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i192 = p7.b;
                                                    l41 K = l41.K(p7.class);
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
                                                arrayList32.add(k7.i(gd.M0(2131749994, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            v7 v7Var32 = f8Var3.c;
                                            boolean isEmpty2 = v7Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i20 = 0;
                                            while (i20 < size2) {
                                                Object obj4 = arrayList22.get(i20);
                                                i20++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = v7Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) v7Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i21 = h7.b;
                                                    l41 K2 = l41.K(h7.class);
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
                                                arrayList4.add(k7.i(gd.M0(2131749999, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            v7 v7Var4 = f8Var3.c;
                                            boolean isEmpty3 = v7Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size3) {
                                                Object obj5 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = v7Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) v7Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i23 = s7.b;
                                                    l41 K3 = l41.K(s7.class);
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
                                                arrayList5.add(k7.i(gd.M0(2131749992, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            v10 v10Var2 = new v10() { // from class: bi.x7
                                @Override // org.telegram.messenger.v10
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    l41 l41Var = (l41) obj;
                                    switch (i13) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) l41Var.H).document.id;
                                            v7 v7Var22 = f8Var2.c;
                                            HashSet hashSet = v7Var22.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = v7Var22.f;
                                                int size = arrayList22.size();
                                                int i172 = 0;
                                                while (i172 < size) {
                                                    Object obj3 = arrayList22.get(i172);
                                                    i172++;
                                                    long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j10 != j3) {
                                                        hashSet.add(Long.valueOf(j10));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j3));
                                            }
                                            v7Var22.m();
                                            y60Var2.v();
                                            break;
                                        case 1:
                                            int i182 = ((TL_stars.starGiftAttributeBackdrop) l41Var.H).backdrop_id;
                                            v7 v7Var32 = f8Var2.c;
                                            HashSet hashSet2 = v7Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i182))) {
                                                hashSet2.remove(Integer.valueOf(i182));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = v7Var32.g;
                                                int size2 = arrayList32.size();
                                                int i192 = 0;
                                                while (i192 < size2) {
                                                    Object obj4 = arrayList32.get(i192);
                                                    i192++;
                                                    int i20 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i20 != i182) {
                                                        hashSet2.add(Integer.valueOf(i20));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i182));
                                            }
                                            v7Var32.m();
                                            y60Var2.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) l41Var.H).document.id;
                                            v7 v7Var4 = f8Var2.c;
                                            HashSet hashSet3 = v7Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = v7Var4.h;
                                                int size3 = arrayList4.size();
                                                int i21 = 0;
                                                while (i21 < size3) {
                                                    Object obj5 = arrayList4.get(i21);
                                                    i21++;
                                                    long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j12 != j11) {
                                                        hashSet3.add(Long.valueOf(j12));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j11));
                                            }
                                            v7Var4.m();
                                            y60Var2.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var2 = g8Var.J0;
                            Context context3 = context;
                            g7 g7Var2 = new g7(context3, i18, 0, false, q10Var2, v10Var2, null, i6Var2, 5);
                            g7Var2.g3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.F8, g8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar2 = new mt(context3, g8Var.J0);
                            mtVar2.setTextSize(1, 16.0f);
                            mtVar2.setInputType(573441);
                            mtVar2.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar2, org.telegram.ui.ActionBar.n6.A6, g8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar2, 30, org.telegram.ui.ActionBar.n6.G6, g8Var.J0);
                            mtVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar2.setCursorWidth(1.5f);
                            mtVar2.setHint(gd.M0(2131749993, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar2, org.telegram.ui.ActionBar.n6.E8, g8Var.J0);
                            mtVar2.setBackground(null);
                            frameLayout2.addView(mtVar2, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar2.addTextChangedListener(new v(strArr2, g7Var2, false, 5));
                            if (arrayList2.size() > 8) {
                                y60Var2.r(frameLayout2, ma.o(-1, 44));
                                y60Var2.k();
                            }
                            if (!v7Var2.k.isEmpty()) {
                                y60Var2.c(R.drawable.msg_select, gd.M0(2131745475, null), new y7(f8Var2, 1), false);
                            }
                            y60Var2.q(g7Var2);
                            y60Var2.a0();
                            break;
                        }
                        break;
                    default:
                        v7 v7Var3 = f8Var2.c;
                        if (!v7Var3.h.isEmpty()) {
                            final y60 y60Var3 = new y60(g8Var.c, g8Var.J0, g8Var.Z1, false, true, false);
                            y60Var3.t = false;
                            y60Var3.b0 = true;
                            y60Var3.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            y60Var3.U = true;
                            y60Var3.p = new c6(y60Var3, 5);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(v7Var3.h);
                            Collections.sort(arrayList3, new Comparator() { // from class: bi.a8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i13) {
                                        case 0:
                                            f8 f8Var3 = f8Var2;
                                            Integer num = (Integer) f8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) f8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            f8 f8Var4 = f8Var2;
                                            Integer num3 = (Integer) f8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) f8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            f8 f8Var5 = f8Var2;
                                            Integer num5 = (Integer) f8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) f8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i19 = g8Var.a;
                            q10 q10Var3 = new q10() { // from class: bi.w7
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.q10
                                public final void a(Object obj, Object obj2) {
                                    int i172 = i12;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    f8 f8Var3 = f8Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i172) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            v7 v7Var22 = f8Var3.c;
                                            boolean isEmpty = v7Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i182 = 0;
                                            while (i182 < size) {
                                                Object obj3 = arrayList22.get(i182);
                                                i182++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = v7Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) v7Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i192 = p7.b;
                                                    l41 K = l41.K(p7.class);
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
                                                arrayList32.add(k7.i(gd.M0(2131749994, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            v7 v7Var32 = f8Var3.c;
                                            boolean isEmpty2 = v7Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i20 = 0;
                                            while (i20 < size2) {
                                                Object obj4 = arrayList22.get(i20);
                                                i20++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = v7Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) v7Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i21 = h7.b;
                                                    l41 K2 = l41.K(h7.class);
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
                                                arrayList4.add(k7.i(gd.M0(2131749999, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            v7 v7Var4 = f8Var3.c;
                                            boolean isEmpty3 = v7Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size3) {
                                                Object obj5 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = v7Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) v7Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i23 = s7.b;
                                                    l41 K3 = l41.K(s7.class);
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
                                                arrayList5.add(k7.i(gd.M0(2131749992, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            v10 v10Var3 = new v10() { // from class: bi.x7
                                @Override // org.telegram.messenger.v10
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    l41 l41Var = (l41) obj;
                                    switch (i12) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) l41Var.H).document.id;
                                            v7 v7Var22 = f8Var2.c;
                                            HashSet hashSet = v7Var22.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = v7Var22.f;
                                                int size = arrayList22.size();
                                                int i172 = 0;
                                                while (i172 < size) {
                                                    Object obj3 = arrayList22.get(i172);
                                                    i172++;
                                                    long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j10 != j3) {
                                                        hashSet.add(Long.valueOf(j10));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j3));
                                            }
                                            v7Var22.m();
                                            y60Var3.v();
                                            break;
                                        case 1:
                                            int i182 = ((TL_stars.starGiftAttributeBackdrop) l41Var.H).backdrop_id;
                                            v7 v7Var32 = f8Var2.c;
                                            HashSet hashSet2 = v7Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i182))) {
                                                hashSet2.remove(Integer.valueOf(i182));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = v7Var32.g;
                                                int size2 = arrayList32.size();
                                                int i192 = 0;
                                                while (i192 < size2) {
                                                    Object obj4 = arrayList32.get(i192);
                                                    i192++;
                                                    int i20 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i20 != i182) {
                                                        hashSet2.add(Integer.valueOf(i20));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i182));
                                            }
                                            v7Var32.m();
                                            y60Var3.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) l41Var.H).document.id;
                                            v7 v7Var4 = f8Var2.c;
                                            HashSet hashSet3 = v7Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = v7Var4.h;
                                                int size3 = arrayList4.size();
                                                int i21 = 0;
                                                while (i21 < size3) {
                                                    Object obj5 = arrayList4.get(i21);
                                                    i21++;
                                                    long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j12 != j11) {
                                                        hashSet3.add(Long.valueOf(j12));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j11));
                                            }
                                            v7Var4.m();
                                            y60Var3.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var3 = g8Var.J0;
                            Context context4 = context;
                            g7 g7Var3 = new g7(context4, i19, 0, false, q10Var3, v10Var3, null, i6Var3, 6);
                            g7Var3.g3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.u6.s(imageView3, org.telegram.ui.ActionBar.n6.F8, g8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar3 = new mt(context4, g8Var.J0);
                            mtVar3.setTextSize(1, 16.0f);
                            mtVar3.setInputType(573441);
                            mtVar3.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar3, org.telegram.ui.ActionBar.n6.A6, g8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar3, 30, org.telegram.ui.ActionBar.n6.G6, g8Var.J0);
                            mtVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar3.setCursorWidth(1.5f);
                            mtVar3.setHint(gd.M0(2131749993, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar3, org.telegram.ui.ActionBar.n6.E8, g8Var.J0);
                            mtVar3.setBackground(null);
                            frameLayout3.addView(mtVar3, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar3.addTextChangedListener(new v(strArr3, g7Var3, false, 6));
                            if (arrayList3.size() > 8) {
                                y60Var3.r(frameLayout3, ma.o(-1, 44));
                                y60Var3.k();
                            }
                            if (!v7Var3.l.isEmpty()) {
                                y60Var3.c(R.drawable.msg_select, gd.M0(2131745475, null), new y7(f8Var2, 2), false);
                            }
                            y60Var3.q(g7Var3);
                            y60Var3.a0();
                            break;
                        }
                        break;
                }
            }
        });
        m7 m7Var4 = new m7(context, this.J0, false);
        this.Z1 = m7Var4;
        m7Var4.setValue(gd.M0(2131750364, null));
        linearLayout.addView(m7Var4, ma.t(-2, -2, 16, 0, 0, 0, 0));
        m7Var4.setOnClickListener(new View.OnClickListener(this) { // from class: bi.d8
            public final /* synthetic */ g8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i7;
                final f8 f8Var2 = f8Var;
                g8 g8Var = this.b;
                final int i12 = 2;
                final int i13 = 1;
                switch (i112) {
                    case 0:
                        v7 v7Var = f8Var2.c;
                        if (!v7Var.f.isEmpty()) {
                            final y60 y60Var = new y60(g8Var.c, g8Var.J0, g8Var.X1, false, true, false);
                            y60Var.t = false;
                            y60Var.b0 = true;
                            y60Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            y60Var.U = true;
                            y60Var.p = new c6(y60Var, 6);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(v7Var.f);
                            final int i14 = 2;
                            Collections.sort(arrayList, new Comparator() { // from class: bi.a8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i14) {
                                        case 0:
                                            f8 f8Var3 = f8Var2;
                                            Integer num = (Integer) f8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) f8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            f8 f8Var4 = f8Var2;
                                            Integer num3 = (Integer) f8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) f8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            f8 f8Var5 = f8Var2;
                                            Integer num5 = (Integer) f8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) f8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i15 = g8Var.a;
                            final int i16 = 0;
                            q10 q10Var = new q10() { // from class: bi.w7
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.q10
                                public final void a(Object obj, Object obj2) {
                                    int i172 = i16;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList;
                                    f8 f8Var3 = f8Var2;
                                    String[] strArr22 = strArr;
                                    switch (i172) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            v7 v7Var22 = f8Var3.c;
                                            boolean isEmpty = v7Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i182 = 0;
                                            while (i182 < size) {
                                                Object obj3 = arrayList22.get(i182);
                                                i182++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = v7Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) v7Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i192 = p7.b;
                                                    l41 K = l41.K(p7.class);
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
                                                arrayList32.add(k7.i(gd.M0(2131749994, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            v7 v7Var32 = f8Var3.c;
                                            boolean isEmpty2 = v7Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i20 = 0;
                                            while (i20 < size2) {
                                                Object obj4 = arrayList22.get(i20);
                                                i20++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = v7Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) v7Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i21 = h7.b;
                                                    l41 K2 = l41.K(h7.class);
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
                                                arrayList4.add(k7.i(gd.M0(2131749999, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            v7 v7Var4 = f8Var3.c;
                                            boolean isEmpty3 = v7Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size3) {
                                                Object obj5 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = v7Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) v7Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i23 = s7.b;
                                                    l41 K3 = l41.K(s7.class);
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
                                                arrayList5.add(k7.i(gd.M0(2131749992, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            v10 v10Var = new v10() { // from class: bi.x7
                                @Override // org.telegram.messenger.v10
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    l41 l41Var = (l41) obj;
                                    switch (i16) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) l41Var.H).document.id;
                                            v7 v7Var22 = f8Var2.c;
                                            HashSet hashSet = v7Var22.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = v7Var22.f;
                                                int size = arrayList22.size();
                                                int i172 = 0;
                                                while (i172 < size) {
                                                    Object obj3 = arrayList22.get(i172);
                                                    i172++;
                                                    long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j10 != j3) {
                                                        hashSet.add(Long.valueOf(j10));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j3));
                                            }
                                            v7Var22.m();
                                            y60Var.v();
                                            break;
                                        case 1:
                                            int i182 = ((TL_stars.starGiftAttributeBackdrop) l41Var.H).backdrop_id;
                                            v7 v7Var32 = f8Var2.c;
                                            HashSet hashSet2 = v7Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i182))) {
                                                hashSet2.remove(Integer.valueOf(i182));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = v7Var32.g;
                                                int size2 = arrayList32.size();
                                                int i192 = 0;
                                                while (i192 < size2) {
                                                    Object obj4 = arrayList32.get(i192);
                                                    i192++;
                                                    int i20 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i20 != i182) {
                                                        hashSet2.add(Integer.valueOf(i20));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i182));
                                            }
                                            v7Var32.m();
                                            y60Var.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) l41Var.H).document.id;
                                            v7 v7Var4 = f8Var2.c;
                                            HashSet hashSet3 = v7Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = v7Var4.h;
                                                int size3 = arrayList4.size();
                                                int i21 = 0;
                                                while (i21 < size3) {
                                                    Object obj5 = arrayList4.get(i21);
                                                    i21++;
                                                    long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j12 != j11) {
                                                        hashSet3.add(Long.valueOf(j12));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j11));
                                            }
                                            v7Var4.m();
                                            y60Var.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var = g8Var.J0;
                            Context context2 = context;
                            g7 g7Var = new g7(context2, i15, 0, false, q10Var, v10Var, null, i6Var, 4);
                            g7Var.g3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.F8, g8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar = new mt(context2, g8Var.J0);
                            mtVar.setTextSize(1, 16.0f);
                            mtVar.setInputType(573441);
                            mtVar.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar, org.telegram.ui.ActionBar.n6.A6, g8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar, 30, org.telegram.ui.ActionBar.n6.G6, g8Var.J0);
                            mtVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar.setCursorWidth(1.5f);
                            mtVar.setHint(gd.M0(2131749993, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar, org.telegram.ui.ActionBar.n6.E8, g8Var.J0);
                            mtVar.setBackground(null);
                            frameLayout.addView(mtVar, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar.addTextChangedListener(new v(strArr, g7Var, false, 4));
                            if (arrayList.size() > 8) {
                                y60Var.r(frameLayout, ma.o(-1, 44));
                                y60Var.k();
                            }
                            if (!v7Var.j.isEmpty()) {
                                y60Var.c(R.drawable.msg_select, gd.M0(2131745475, null), new y7(f8Var2, 0), false);
                            }
                            y60Var.q(g7Var);
                            y60Var.a0();
                            break;
                        }
                        break;
                    case 1:
                        v7 v7Var2 = f8Var2.c;
                        if (!v7Var2.g.isEmpty()) {
                            final y60 y60Var2 = new y60(g8Var.c, g8Var.J0, g8Var.Y1, false, true, false);
                            y60Var2.t = false;
                            y60Var2.b0 = true;
                            y60Var2.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            y60Var2.U = true;
                            y60Var2.p = new c6(y60Var2, 4);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(v7Var2.g);
                            final int i17 = 0;
                            Collections.sort(arrayList2, new Comparator() { // from class: bi.a8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i17) {
                                        case 0:
                                            f8 f8Var3 = f8Var2;
                                            Integer num = (Integer) f8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) f8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            f8 f8Var4 = f8Var2;
                                            Integer num3 = (Integer) f8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) f8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            f8 f8Var5 = f8Var2;
                                            Integer num5 = (Integer) f8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) f8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i18 = g8Var.a;
                            q10 q10Var2 = new q10() { // from class: bi.w7
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.q10
                                public final void a(Object obj, Object obj2) {
                                    int i172 = i13;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    f8 f8Var3 = f8Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i172) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            v7 v7Var22 = f8Var3.c;
                                            boolean isEmpty = v7Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i182 = 0;
                                            while (i182 < size) {
                                                Object obj3 = arrayList22.get(i182);
                                                i182++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = v7Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) v7Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i192 = p7.b;
                                                    l41 K = l41.K(p7.class);
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
                                                arrayList32.add(k7.i(gd.M0(2131749994, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            v7 v7Var32 = f8Var3.c;
                                            boolean isEmpty2 = v7Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i20 = 0;
                                            while (i20 < size2) {
                                                Object obj4 = arrayList22.get(i20);
                                                i20++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = v7Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) v7Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i21 = h7.b;
                                                    l41 K2 = l41.K(h7.class);
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
                                                arrayList4.add(k7.i(gd.M0(2131749999, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            v7 v7Var4 = f8Var3.c;
                                            boolean isEmpty3 = v7Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size3) {
                                                Object obj5 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = v7Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) v7Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i23 = s7.b;
                                                    l41 K3 = l41.K(s7.class);
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
                                                arrayList5.add(k7.i(gd.M0(2131749992, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            v10 v10Var2 = new v10() { // from class: bi.x7
                                @Override // org.telegram.messenger.v10
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    l41 l41Var = (l41) obj;
                                    switch (i13) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) l41Var.H).document.id;
                                            v7 v7Var22 = f8Var2.c;
                                            HashSet hashSet = v7Var22.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = v7Var22.f;
                                                int size = arrayList22.size();
                                                int i172 = 0;
                                                while (i172 < size) {
                                                    Object obj3 = arrayList22.get(i172);
                                                    i172++;
                                                    long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j10 != j3) {
                                                        hashSet.add(Long.valueOf(j10));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j3));
                                            }
                                            v7Var22.m();
                                            y60Var2.v();
                                            break;
                                        case 1:
                                            int i182 = ((TL_stars.starGiftAttributeBackdrop) l41Var.H).backdrop_id;
                                            v7 v7Var32 = f8Var2.c;
                                            HashSet hashSet2 = v7Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i182))) {
                                                hashSet2.remove(Integer.valueOf(i182));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = v7Var32.g;
                                                int size2 = arrayList32.size();
                                                int i192 = 0;
                                                while (i192 < size2) {
                                                    Object obj4 = arrayList32.get(i192);
                                                    i192++;
                                                    int i20 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i20 != i182) {
                                                        hashSet2.add(Integer.valueOf(i20));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i182));
                                            }
                                            v7Var32.m();
                                            y60Var2.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) l41Var.H).document.id;
                                            v7 v7Var4 = f8Var2.c;
                                            HashSet hashSet3 = v7Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = v7Var4.h;
                                                int size3 = arrayList4.size();
                                                int i21 = 0;
                                                while (i21 < size3) {
                                                    Object obj5 = arrayList4.get(i21);
                                                    i21++;
                                                    long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j12 != j11) {
                                                        hashSet3.add(Long.valueOf(j12));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j11));
                                            }
                                            v7Var4.m();
                                            y60Var2.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var2 = g8Var.J0;
                            Context context3 = context;
                            g7 g7Var2 = new g7(context3, i18, 0, false, q10Var2, v10Var2, null, i6Var2, 5);
                            g7Var2.g3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.F8, g8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar2 = new mt(context3, g8Var.J0);
                            mtVar2.setTextSize(1, 16.0f);
                            mtVar2.setInputType(573441);
                            mtVar2.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar2, org.telegram.ui.ActionBar.n6.A6, g8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar2, 30, org.telegram.ui.ActionBar.n6.G6, g8Var.J0);
                            mtVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar2.setCursorWidth(1.5f);
                            mtVar2.setHint(gd.M0(2131749993, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar2, org.telegram.ui.ActionBar.n6.E8, g8Var.J0);
                            mtVar2.setBackground(null);
                            frameLayout2.addView(mtVar2, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar2.addTextChangedListener(new v(strArr2, g7Var2, false, 5));
                            if (arrayList2.size() > 8) {
                                y60Var2.r(frameLayout2, ma.o(-1, 44));
                                y60Var2.k();
                            }
                            if (!v7Var2.k.isEmpty()) {
                                y60Var2.c(R.drawable.msg_select, gd.M0(2131745475, null), new y7(f8Var2, 1), false);
                            }
                            y60Var2.q(g7Var2);
                            y60Var2.a0();
                            break;
                        }
                        break;
                    default:
                        v7 v7Var3 = f8Var2.c;
                        if (!v7Var3.h.isEmpty()) {
                            final y60 y60Var3 = new y60(g8Var.c, g8Var.J0, g8Var.Z1, false, true, false);
                            y60Var3.t = false;
                            y60Var3.b0 = true;
                            y60Var3.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            y60Var3.U = true;
                            y60Var3.p = new c6(y60Var3, 5);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(v7Var3.h);
                            Collections.sort(arrayList3, new Comparator() { // from class: bi.a8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i13) {
                                        case 0:
                                            f8 f8Var3 = f8Var2;
                                            Integer num = (Integer) f8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) f8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            f8 f8Var4 = f8Var2;
                                            Integer num3 = (Integer) f8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) f8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            f8 f8Var5 = f8Var2;
                                            Integer num5 = (Integer) f8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) f8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i19 = g8Var.a;
                            q10 q10Var3 = new q10() { // from class: bi.w7
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.q10
                                public final void a(Object obj, Object obj2) {
                                    int i172 = i12;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    f8 f8Var3 = f8Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i172) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            v7 v7Var22 = f8Var3.c;
                                            boolean isEmpty = v7Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i182 = 0;
                                            while (i182 < size) {
                                                Object obj3 = arrayList22.get(i182);
                                                i182++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = v7Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) v7Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i192 = p7.b;
                                                    l41 K = l41.K(p7.class);
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
                                                arrayList32.add(k7.i(gd.M0(2131749994, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            v7 v7Var32 = f8Var3.c;
                                            boolean isEmpty2 = v7Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i20 = 0;
                                            while (i20 < size2) {
                                                Object obj4 = arrayList22.get(i20);
                                                i20++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = v7Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) v7Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i21 = h7.b;
                                                    l41 K2 = l41.K(h7.class);
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
                                                arrayList4.add(k7.i(gd.M0(2131749999, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            v7 v7Var4 = f8Var3.c;
                                            boolean isEmpty3 = v7Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size3) {
                                                Object obj5 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = v7Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) v7Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i23 = s7.b;
                                                    l41 K3 = l41.K(s7.class);
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
                                                arrayList5.add(k7.i(gd.M0(2131749992, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            v10 v10Var3 = new v10() { // from class: bi.x7
                                @Override // org.telegram.messenger.v10
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    l41 l41Var = (l41) obj;
                                    switch (i12) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) l41Var.H).document.id;
                                            v7 v7Var22 = f8Var2.c;
                                            HashSet hashSet = v7Var22.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = v7Var22.f;
                                                int size = arrayList22.size();
                                                int i172 = 0;
                                                while (i172 < size) {
                                                    Object obj3 = arrayList22.get(i172);
                                                    i172++;
                                                    long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j10 != j3) {
                                                        hashSet.add(Long.valueOf(j10));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j3));
                                            }
                                            v7Var22.m();
                                            y60Var3.v();
                                            break;
                                        case 1:
                                            int i182 = ((TL_stars.starGiftAttributeBackdrop) l41Var.H).backdrop_id;
                                            v7 v7Var32 = f8Var2.c;
                                            HashSet hashSet2 = v7Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i182))) {
                                                hashSet2.remove(Integer.valueOf(i182));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = v7Var32.g;
                                                int size2 = arrayList32.size();
                                                int i192 = 0;
                                                while (i192 < size2) {
                                                    Object obj4 = arrayList32.get(i192);
                                                    i192++;
                                                    int i20 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i20 != i182) {
                                                        hashSet2.add(Integer.valueOf(i20));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i182));
                                            }
                                            v7Var32.m();
                                            y60Var3.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) l41Var.H).document.id;
                                            v7 v7Var4 = f8Var2.c;
                                            HashSet hashSet3 = v7Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = v7Var4.h;
                                                int size3 = arrayList4.size();
                                                int i21 = 0;
                                                while (i21 < size3) {
                                                    Object obj5 = arrayList4.get(i21);
                                                    i21++;
                                                    long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j12 != j11) {
                                                        hashSet3.add(Long.valueOf(j12));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j11));
                                            }
                                            v7Var4.m();
                                            y60Var3.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var3 = g8Var.J0;
                            Context context4 = context;
                            g7 g7Var3 = new g7(context4, i19, 0, false, q10Var3, v10Var3, null, i6Var3, 6);
                            g7Var3.g3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.u6.s(imageView3, org.telegram.ui.ActionBar.n6.F8, g8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar3 = new mt(context4, g8Var.J0);
                            mtVar3.setTextSize(1, 16.0f);
                            mtVar3.setInputType(573441);
                            mtVar3.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar3, org.telegram.ui.ActionBar.n6.A6, g8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar3, 30, org.telegram.ui.ActionBar.n6.G6, g8Var.J0);
                            mtVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar3.setCursorWidth(1.5f);
                            mtVar3.setHint(gd.M0(2131749993, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar3, org.telegram.ui.ActionBar.n6.E8, g8Var.J0);
                            mtVar3.setBackground(null);
                            frameLayout3.addView(mtVar3, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar3.addTextChangedListener(new v(strArr3, g7Var3, false, 6));
                            if (arrayList3.size() > 8) {
                                y60Var3.r(frameLayout3, ma.o(-1, 44));
                                y60Var3.k();
                            }
                            if (!v7Var3.l.isEmpty()) {
                                y60Var3.c(R.drawable.msg_select, gd.M0(2131745475, null), new y7(f8Var2, 2), false);
                            }
                            y60Var3.q(g7Var3);
                            y60Var3.a0();
                            break;
                        }
                        break;
                }
            }
        });
        getContext();
        v4.t tVar = new v4.t(3);
        tVar.O = new s2(this, i11);
        this.o1.setLayoutManager(tVar);
        this.o1.setOnItemClickListener(new ab.g(6, this, f8Var));
        this.o1.setPadding(org.telegram.messenger.g0.L(8.0f) + this.u0, 0, org.telegram.messenger.g0.L(8.0f) + this.u0, 0);
        this.o1.setOnScrollListener(new q1(this, i7));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(lr.h);
        kVar.n(350L);
        this.o1.setItemAnimator(kVar);
        this.o1.setItemSelectorColorProvider(new a3.l(23));
        di.k4 k4Var = new di.k4(context);
        this.a2 = k4Var;
        int L = org.telegram.messenger.g0.L(20.0f);
        int L2 = org.telegram.messenger.g0.L(9.0f);
        k4Var.h = L;
        k4Var.n = L2;
        k4Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
        k4Var.setFullRect(true);
        org.telegram.messenger.g0.m2(new ai.g0(k4Var, 11), 12.0f, 12, new ArrayList());
        k4Var.setPivotY(0.0f);
        this.c.addView(k4Var, ma.e(-1, -2, 55));
        this.e2.O(false);
        f8Var.d = new z7(this, i11);
    }

    @Override // org.telegram.ui.Components.sa
    public final bk0 M0(ck0 ck0Var) {
        e8 e8Var = new e8(this, ck0Var, getContext(), this.a, new b(this, 10), this.J0, 0);
        this.e2 = e8Var;
        return e8Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        String str = this.T1;
        return str != null ? str : gd.M0(2131749755, null);
    }

    @Override // org.telegram.ui.Components.sa
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
        l41 G;
        int i7 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            ck0 ck0Var = this.o1;
            if (i7 >= ck0Var.getChildCount()) {
                break;
            }
            View childAt = ck0Var.getChildAt(i7);
            if ((childAt instanceof wz) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.e2.G(R)) != null) {
                if (G.d < 10) {
                    z10 = true;
                } else {
                    z11 = true;
                }
            }
            i7++;
        }
        f8 f8Var = this.U1;
        if (z10) {
            f8Var.b.a();
        }
        if (z11) {
            f8Var.c.l(false);
        }
    }
}
