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
import org.telegram.messenger.hd;
import org.telegram.messenger.r10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.yz;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class i8 extends sa {
    public static final /* synthetic */ int g2 = 0;
    public final String T1;
    public final h8 U1;
    public final HorizontalScrollView V1;
    public final o7 W1;
    public final o7 X1;
    public final o7 Y1;
    public final o7 Z1;
    public final di.k4 a2;
    public di.c2 b2;
    public final HashSet c2;
    public boolean d2;
    public g8 e2;
    public boolean f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(final Context context, String str, final h8 h8Var) {
        super(2, context, (org.telegram.ui.ActionBar.h6) null, false);
        final int i7 = 2;
        final int i10 = 0;
        this.c2 = new HashSet();
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        O();
        this.T1 = str;
        this.U1 = h8Var;
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
        o7 o7Var = new o7(context, this.J0, false);
        this.W1 = o7Var;
        o7Var.setSorting(h8Var.c.p);
        linearLayout.addView(o7Var, ma.t(-2, -2, 16, 0, 0, 6, 0));
        int i11 = 6;
        o7Var.setOnClickListener(new ai.y2(i11, this, h8Var));
        o7 o7Var2 = new o7(context, this.J0, false);
        this.X1 = o7Var2;
        o7Var2.setValue(hd.N0(2131750370, null));
        linearLayout.addView(o7Var2, ma.t(-2, -2, 16, 0, 0, 6, 0));
        o7Var2.setOnClickListener(new View.OnClickListener(this) { // from class: bi.f8
            public final /* synthetic */ i8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i10;
                final h8 h8Var2 = h8Var;
                i8 i8Var = this.b;
                final int i13 = 2;
                final int i14 = 1;
                switch (i12) {
                    case 0:
                        x7 x7Var = h8Var2.c;
                        if (!x7Var.f.isEmpty()) {
                            final a70 a70Var = new a70(i8Var.c, i8Var.J0, i8Var.X1, false, true, false);
                            a70Var.t = false;
                            a70Var.b0 = true;
                            a70Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            a70Var.U = true;
                            a70Var.p = new e6(a70Var, 6);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(x7Var.f);
                            final int i15 = 2;
                            Collections.sort(arrayList, new Comparator() { // from class: bi.c8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i15) {
                                        case 0:
                                            h8 h8Var3 = h8Var2;
                                            Integer num = (Integer) h8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) h8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            h8 h8Var4 = h8Var2;
                                            Integer num3 = (Integer) h8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) h8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            h8 h8Var5 = h8Var2;
                                            Integer num5 = (Integer) h8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) h8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i16 = i8Var.a;
                            final int i17 = 0;
                            r10 r10Var = new r10() { // from class: bi.y7
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.r10
                                public final void a(Object obj, Object obj2) {
                                    int i18 = i17;
                                    boolean z10 = false;
                                    ArrayList arrayList2 = arrayList;
                                    h8 h8Var3 = h8Var2;
                                    String[] strArr2 = strArr;
                                    switch (i18) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            String lowerCase = strArr2[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            x7 x7Var2 = h8Var3.c;
                                            boolean isEmpty = x7Var2.j.isEmpty();
                                            int size = arrayList2.size();
                                            int i19 = 0;
                                            while (i19 < size) {
                                                Object obj3 = arrayList2.get(i19);
                                                i19++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = x7Var2.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) x7Var2.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i20 = r7.b;
                                                    o41 K = o41.K(r7.class);
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
                                                arrayList3.add(m7.i(hd.N0(2131749993, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr2[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            x7 x7Var3 = h8Var3.c;
                                            boolean isEmpty2 = x7Var3.k.isEmpty();
                                            int size2 = arrayList2.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList2.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = x7Var3.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) x7Var3.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = j7.b;
                                                    o41 K2 = o41.K(j7.class);
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
                                                arrayList4.add(m7.i(hd.N0(2131749998, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr2[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            x7 x7Var4 = h8Var3.c;
                                            boolean isEmpty3 = x7Var4.l.isEmpty();
                                            int size3 = arrayList2.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList2.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = x7Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) x7Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = u7.b;
                                                    o41 K3 = o41.K(u7.class);
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
                                                arrayList5.add(m7.i(hd.N0(2131749991, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            w10 w10Var = new w10() { // from class: bi.z7
                                @Override // org.telegram.messenger.w10
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    o41 o41Var = (o41) obj;
                                    switch (i17) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) o41Var.H).document.id;
                                            x7 x7Var2 = h8Var2.c;
                                            HashSet hashSet = x7Var2.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList2 = x7Var2.f;
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
                                            x7Var2.m();
                                            a70Var.v();
                                            break;
                                        case 1:
                                            int i19 = ((TL_stars.starGiftAttributeBackdrop) o41Var.H).backdrop_id;
                                            x7 x7Var3 = h8Var2.c;
                                            HashSet hashSet2 = x7Var3.k;
                                            if (hashSet2.contains(Integer.valueOf(i19))) {
                                                hashSet2.remove(Integer.valueOf(i19));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList3 = x7Var3.g;
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
                                            x7Var3.m();
                                            a70Var.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) o41Var.H).document.id;
                                            x7 x7Var4 = h8Var2.c;
                                            HashSet hashSet3 = x7Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = x7Var4.h;
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
                                            x7Var4.m();
                                            a70Var.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.h6 h6Var = i8Var.J0;
                            Context context2 = context;
                            i7 i7Var = new i7(context2, i16, 0, false, r10Var, w10Var, null, h6Var, 4);
                            i7Var.g3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.F8, i8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ot otVar = new ot(context2, i8Var.J0);
                            otVar.setTextSize(1, 16.0f);
                            otVar.setInputType(573441);
                            otVar.setRawInputType(573441);
                            org.telegram.ui.ActionBar.t6.D(otVar, org.telegram.ui.ActionBar.m6.A6, i8Var.J0);
                            org.telegram.ui.ActionBar.t6.l(otVar, 30, org.telegram.ui.ActionBar.m6.G6, i8Var.J0);
                            otVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            otVar.setCursorWidth(1.5f);
                            otVar.setHint(hd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.t6.U(otVar, org.telegram.ui.ActionBar.m6.E8, i8Var.J0);
                            otVar.setBackground(null);
                            frameLayout.addView(otVar, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            otVar.addTextChangedListener(new v(strArr, i7Var, false, 4));
                            if (arrayList.size() > 8) {
                                a70Var.r(frameLayout, ma.o(-1, 44));
                                a70Var.k();
                            }
                            if (!x7Var.j.isEmpty()) {
                                a70Var.c(R.drawable.msg_select, hd.N0(2131745474, null), new a8(h8Var2, 0), false);
                            }
                            a70Var.q(i7Var);
                            a70Var.a0();
                            break;
                        }
                        break;
                    case 1:
                        x7 x7Var2 = h8Var2.c;
                        if (!x7Var2.g.isEmpty()) {
                            final a70 a70Var2 = new a70(i8Var.c, i8Var.J0, i8Var.Y1, false, true, false);
                            a70Var2.t = false;
                            a70Var2.b0 = true;
                            a70Var2.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            a70Var2.U = true;
                            a70Var2.p = new e6(a70Var2, 4);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(x7Var2.g);
                            final int i18 = 0;
                            Collections.sort(arrayList2, new Comparator() { // from class: bi.c8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i18) {
                                        case 0:
                                            h8 h8Var3 = h8Var2;
                                            Integer num = (Integer) h8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) h8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            h8 h8Var4 = h8Var2;
                                            Integer num3 = (Integer) h8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) h8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            h8 h8Var5 = h8Var2;
                                            Integer num5 = (Integer) h8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) h8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i19 = i8Var.a;
                            r10 r10Var2 = new r10() { // from class: bi.y7
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.r10
                                public final void a(Object obj, Object obj2) {
                                    int i182 = i14;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    h8 h8Var3 = h8Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i182) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            x7 x7Var22 = h8Var3.c;
                                            boolean isEmpty = x7Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i192 = 0;
                                            while (i192 < size) {
                                                Object obj3 = arrayList22.get(i192);
                                                i192++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = x7Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) x7Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i20 = r7.b;
                                                    o41 K = o41.K(r7.class);
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
                                                arrayList3.add(m7.i(hd.N0(2131749993, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            x7 x7Var3 = h8Var3.c;
                                            boolean isEmpty2 = x7Var3.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList22.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = x7Var3.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) x7Var3.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = j7.b;
                                                    o41 K2 = o41.K(j7.class);
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
                                                arrayList4.add(m7.i(hd.N0(2131749998, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            x7 x7Var4 = h8Var3.c;
                                            boolean isEmpty3 = x7Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList22.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = x7Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) x7Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = u7.b;
                                                    o41 K3 = o41.K(u7.class);
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
                                                arrayList5.add(m7.i(hd.N0(2131749991, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            w10 w10Var2 = new w10() { // from class: bi.z7
                                @Override // org.telegram.messenger.w10
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    o41 o41Var = (o41) obj;
                                    switch (i14) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) o41Var.H).document.id;
                                            x7 x7Var22 = h8Var2.c;
                                            HashSet hashSet = x7Var22.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = x7Var22.f;
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
                                            x7Var22.m();
                                            a70Var2.v();
                                            break;
                                        case 1:
                                            int i192 = ((TL_stars.starGiftAttributeBackdrop) o41Var.H).backdrop_id;
                                            x7 x7Var3 = h8Var2.c;
                                            HashSet hashSet2 = x7Var3.k;
                                            if (hashSet2.contains(Integer.valueOf(i192))) {
                                                hashSet2.remove(Integer.valueOf(i192));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList3 = x7Var3.g;
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
                                            x7Var3.m();
                                            a70Var2.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) o41Var.H).document.id;
                                            x7 x7Var4 = h8Var2.c;
                                            HashSet hashSet3 = x7Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = x7Var4.h;
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
                                            x7Var4.m();
                                            a70Var2.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.h6 h6Var2 = i8Var.J0;
                            Context context3 = context;
                            i7 i7Var2 = new i7(context3, i19, 0, false, r10Var2, w10Var2, null, h6Var2, 5);
                            i7Var2.g3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.F8, i8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ot otVar2 = new ot(context3, i8Var.J0);
                            otVar2.setTextSize(1, 16.0f);
                            otVar2.setInputType(573441);
                            otVar2.setRawInputType(573441);
                            org.telegram.ui.ActionBar.t6.D(otVar2, org.telegram.ui.ActionBar.m6.A6, i8Var.J0);
                            org.telegram.ui.ActionBar.t6.l(otVar2, 30, org.telegram.ui.ActionBar.m6.G6, i8Var.J0);
                            otVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            otVar2.setCursorWidth(1.5f);
                            otVar2.setHint(hd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.t6.U(otVar2, org.telegram.ui.ActionBar.m6.E8, i8Var.J0);
                            otVar2.setBackground(null);
                            frameLayout2.addView(otVar2, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            otVar2.addTextChangedListener(new v(strArr2, i7Var2, false, 5));
                            if (arrayList2.size() > 8) {
                                a70Var2.r(frameLayout2, ma.o(-1, 44));
                                a70Var2.k();
                            }
                            if (!x7Var2.k.isEmpty()) {
                                a70Var2.c(R.drawable.msg_select, hd.N0(2131745474, null), new a8(h8Var2, 1), false);
                            }
                            a70Var2.q(i7Var2);
                            a70Var2.a0();
                            break;
                        }
                        break;
                    default:
                        x7 x7Var3 = h8Var2.c;
                        if (!x7Var3.h.isEmpty()) {
                            final a70 a70Var3 = new a70(i8Var.c, i8Var.J0, i8Var.Z1, false, true, false);
                            a70Var3.t = false;
                            a70Var3.b0 = true;
                            a70Var3.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            a70Var3.U = true;
                            a70Var3.p = new e6(a70Var3, 5);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(x7Var3.h);
                            Collections.sort(arrayList3, new Comparator() { // from class: bi.c8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i14) {
                                        case 0:
                                            h8 h8Var3 = h8Var2;
                                            Integer num = (Integer) h8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) h8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            h8 h8Var4 = h8Var2;
                                            Integer num3 = (Integer) h8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) h8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            h8 h8Var5 = h8Var2;
                                            Integer num5 = (Integer) h8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) h8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i20 = i8Var.a;
                            r10 r10Var3 = new r10() { // from class: bi.y7
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.r10
                                public final void a(Object obj, Object obj2) {
                                    int i182 = i13;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    h8 h8Var3 = h8Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i182) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            x7 x7Var22 = h8Var3.c;
                                            boolean isEmpty = x7Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i192 = 0;
                                            while (i192 < size) {
                                                Object obj3 = arrayList22.get(i192);
                                                i192++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = x7Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) x7Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i202 = r7.b;
                                                    o41 K = o41.K(r7.class);
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
                                                arrayList32.add(m7.i(hd.N0(2131749993, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            x7 x7Var32 = h8Var3.c;
                                            boolean isEmpty2 = x7Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList22.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = x7Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) x7Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = j7.b;
                                                    o41 K2 = o41.K(j7.class);
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
                                                arrayList4.add(m7.i(hd.N0(2131749998, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            x7 x7Var4 = h8Var3.c;
                                            boolean isEmpty3 = x7Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList22.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = x7Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) x7Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = u7.b;
                                                    o41 K3 = o41.K(u7.class);
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
                                                arrayList5.add(m7.i(hd.N0(2131749991, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            w10 w10Var3 = new w10() { // from class: bi.z7
                                @Override // org.telegram.messenger.w10
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    o41 o41Var = (o41) obj;
                                    switch (i13) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) o41Var.H).document.id;
                                            x7 x7Var22 = h8Var2.c;
                                            HashSet hashSet = x7Var22.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = x7Var22.f;
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
                                            x7Var22.m();
                                            a70Var3.v();
                                            break;
                                        case 1:
                                            int i192 = ((TL_stars.starGiftAttributeBackdrop) o41Var.H).backdrop_id;
                                            x7 x7Var32 = h8Var2.c;
                                            HashSet hashSet2 = x7Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i192))) {
                                                hashSet2.remove(Integer.valueOf(i192));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = x7Var32.g;
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
                                            x7Var32.m();
                                            a70Var3.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) o41Var.H).document.id;
                                            x7 x7Var4 = h8Var2.c;
                                            HashSet hashSet3 = x7Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = x7Var4.h;
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
                                            x7Var4.m();
                                            a70Var3.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.h6 h6Var3 = i8Var.J0;
                            Context context4 = context;
                            i7 i7Var3 = new i7(context4, i20, 0, false, r10Var3, w10Var3, null, h6Var3, 6);
                            i7Var3.g3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.t6.s(imageView3, org.telegram.ui.ActionBar.m6.F8, i8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ot otVar3 = new ot(context4, i8Var.J0);
                            otVar3.setTextSize(1, 16.0f);
                            otVar3.setInputType(573441);
                            otVar3.setRawInputType(573441);
                            org.telegram.ui.ActionBar.t6.D(otVar3, org.telegram.ui.ActionBar.m6.A6, i8Var.J0);
                            org.telegram.ui.ActionBar.t6.l(otVar3, 30, org.telegram.ui.ActionBar.m6.G6, i8Var.J0);
                            otVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            otVar3.setCursorWidth(1.5f);
                            otVar3.setHint(hd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.t6.U(otVar3, org.telegram.ui.ActionBar.m6.E8, i8Var.J0);
                            otVar3.setBackground(null);
                            frameLayout3.addView(otVar3, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            otVar3.addTextChangedListener(new v(strArr3, i7Var3, false, 6));
                            if (arrayList3.size() > 8) {
                                a70Var3.r(frameLayout3, ma.o(-1, 44));
                                a70Var3.k();
                            }
                            if (!x7Var3.l.isEmpty()) {
                                a70Var3.c(R.drawable.msg_select, hd.N0(2131745474, null), new a8(h8Var2, 2), false);
                            }
                            a70Var3.q(i7Var3);
                            a70Var3.a0();
                            break;
                        }
                        break;
                }
            }
        });
        o7 o7Var3 = new o7(context, this.J0, false);
        this.Y1 = o7Var3;
        o7Var3.setValue(hd.N0(2131750371, null));
        linearLayout.addView(o7Var3, ma.t(-2, -2, 16, 0, 0, 6, 0));
        final int i12 = 1;
        o7Var3.setOnClickListener(new View.OnClickListener(this) { // from class: bi.f8
            public final /* synthetic */ i8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i122 = i12;
                final h8 h8Var2 = h8Var;
                i8 i8Var = this.b;
                final int i13 = 2;
                final int i14 = 1;
                switch (i122) {
                    case 0:
                        x7 x7Var = h8Var2.c;
                        if (!x7Var.f.isEmpty()) {
                            final a70 a70Var = new a70(i8Var.c, i8Var.J0, i8Var.X1, false, true, false);
                            a70Var.t = false;
                            a70Var.b0 = true;
                            a70Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            a70Var.U = true;
                            a70Var.p = new e6(a70Var, 6);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(x7Var.f);
                            final int i15 = 2;
                            Collections.sort(arrayList, new Comparator() { // from class: bi.c8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i15) {
                                        case 0:
                                            h8 h8Var3 = h8Var2;
                                            Integer num = (Integer) h8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) h8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            h8 h8Var4 = h8Var2;
                                            Integer num3 = (Integer) h8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) h8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            h8 h8Var5 = h8Var2;
                                            Integer num5 = (Integer) h8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) h8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i16 = i8Var.a;
                            final int i17 = 0;
                            r10 r10Var = new r10() { // from class: bi.y7
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.r10
                                public final void a(Object obj, Object obj2) {
                                    int i182 = i17;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList;
                                    h8 h8Var3 = h8Var2;
                                    String[] strArr22 = strArr;
                                    switch (i182) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            x7 x7Var22 = h8Var3.c;
                                            boolean isEmpty = x7Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i192 = 0;
                                            while (i192 < size) {
                                                Object obj3 = arrayList22.get(i192);
                                                i192++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = x7Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) x7Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i202 = r7.b;
                                                    o41 K = o41.K(r7.class);
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
                                                arrayList32.add(m7.i(hd.N0(2131749993, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            x7 x7Var32 = h8Var3.c;
                                            boolean isEmpty2 = x7Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList22.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = x7Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) x7Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = j7.b;
                                                    o41 K2 = o41.K(j7.class);
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
                                                arrayList4.add(m7.i(hd.N0(2131749998, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            x7 x7Var4 = h8Var3.c;
                                            boolean isEmpty3 = x7Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList22.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = x7Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) x7Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = u7.b;
                                                    o41 K3 = o41.K(u7.class);
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
                                                arrayList5.add(m7.i(hd.N0(2131749991, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            w10 w10Var = new w10() { // from class: bi.z7
                                @Override // org.telegram.messenger.w10
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    o41 o41Var = (o41) obj;
                                    switch (i17) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) o41Var.H).document.id;
                                            x7 x7Var22 = h8Var2.c;
                                            HashSet hashSet = x7Var22.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = x7Var22.f;
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
                                            x7Var22.m();
                                            a70Var.v();
                                            break;
                                        case 1:
                                            int i192 = ((TL_stars.starGiftAttributeBackdrop) o41Var.H).backdrop_id;
                                            x7 x7Var32 = h8Var2.c;
                                            HashSet hashSet2 = x7Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i192))) {
                                                hashSet2.remove(Integer.valueOf(i192));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = x7Var32.g;
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
                                            x7Var32.m();
                                            a70Var.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) o41Var.H).document.id;
                                            x7 x7Var4 = h8Var2.c;
                                            HashSet hashSet3 = x7Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = x7Var4.h;
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
                                            x7Var4.m();
                                            a70Var.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.h6 h6Var = i8Var.J0;
                            Context context2 = context;
                            i7 i7Var = new i7(context2, i16, 0, false, r10Var, w10Var, null, h6Var, 4);
                            i7Var.g3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.F8, i8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ot otVar = new ot(context2, i8Var.J0);
                            otVar.setTextSize(1, 16.0f);
                            otVar.setInputType(573441);
                            otVar.setRawInputType(573441);
                            org.telegram.ui.ActionBar.t6.D(otVar, org.telegram.ui.ActionBar.m6.A6, i8Var.J0);
                            org.telegram.ui.ActionBar.t6.l(otVar, 30, org.telegram.ui.ActionBar.m6.G6, i8Var.J0);
                            otVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            otVar.setCursorWidth(1.5f);
                            otVar.setHint(hd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.t6.U(otVar, org.telegram.ui.ActionBar.m6.E8, i8Var.J0);
                            otVar.setBackground(null);
                            frameLayout.addView(otVar, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            otVar.addTextChangedListener(new v(strArr, i7Var, false, 4));
                            if (arrayList.size() > 8) {
                                a70Var.r(frameLayout, ma.o(-1, 44));
                                a70Var.k();
                            }
                            if (!x7Var.j.isEmpty()) {
                                a70Var.c(R.drawable.msg_select, hd.N0(2131745474, null), new a8(h8Var2, 0), false);
                            }
                            a70Var.q(i7Var);
                            a70Var.a0();
                            break;
                        }
                        break;
                    case 1:
                        x7 x7Var2 = h8Var2.c;
                        if (!x7Var2.g.isEmpty()) {
                            final a70 a70Var2 = new a70(i8Var.c, i8Var.J0, i8Var.Y1, false, true, false);
                            a70Var2.t = false;
                            a70Var2.b0 = true;
                            a70Var2.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            a70Var2.U = true;
                            a70Var2.p = new e6(a70Var2, 4);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(x7Var2.g);
                            final int i18 = 0;
                            Collections.sort(arrayList2, new Comparator() { // from class: bi.c8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i18) {
                                        case 0:
                                            h8 h8Var3 = h8Var2;
                                            Integer num = (Integer) h8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) h8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            h8 h8Var4 = h8Var2;
                                            Integer num3 = (Integer) h8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) h8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            h8 h8Var5 = h8Var2;
                                            Integer num5 = (Integer) h8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) h8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i19 = i8Var.a;
                            r10 r10Var2 = new r10() { // from class: bi.y7
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.r10
                                public final void a(Object obj, Object obj2) {
                                    int i182 = i14;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    h8 h8Var3 = h8Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i182) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            x7 x7Var22 = h8Var3.c;
                                            boolean isEmpty = x7Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i192 = 0;
                                            while (i192 < size) {
                                                Object obj3 = arrayList22.get(i192);
                                                i192++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = x7Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) x7Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i202 = r7.b;
                                                    o41 K = o41.K(r7.class);
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
                                                arrayList32.add(m7.i(hd.N0(2131749993, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            x7 x7Var32 = h8Var3.c;
                                            boolean isEmpty2 = x7Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList22.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = x7Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) x7Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = j7.b;
                                                    o41 K2 = o41.K(j7.class);
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
                                                arrayList4.add(m7.i(hd.N0(2131749998, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            x7 x7Var4 = h8Var3.c;
                                            boolean isEmpty3 = x7Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList22.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = x7Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) x7Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = u7.b;
                                                    o41 K3 = o41.K(u7.class);
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
                                                arrayList5.add(m7.i(hd.N0(2131749991, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            w10 w10Var2 = new w10() { // from class: bi.z7
                                @Override // org.telegram.messenger.w10
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    o41 o41Var = (o41) obj;
                                    switch (i14) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) o41Var.H).document.id;
                                            x7 x7Var22 = h8Var2.c;
                                            HashSet hashSet = x7Var22.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = x7Var22.f;
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
                                            x7Var22.m();
                                            a70Var2.v();
                                            break;
                                        case 1:
                                            int i192 = ((TL_stars.starGiftAttributeBackdrop) o41Var.H).backdrop_id;
                                            x7 x7Var32 = h8Var2.c;
                                            HashSet hashSet2 = x7Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i192))) {
                                                hashSet2.remove(Integer.valueOf(i192));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = x7Var32.g;
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
                                            x7Var32.m();
                                            a70Var2.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) o41Var.H).document.id;
                                            x7 x7Var4 = h8Var2.c;
                                            HashSet hashSet3 = x7Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = x7Var4.h;
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
                                            x7Var4.m();
                                            a70Var2.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.h6 h6Var2 = i8Var.J0;
                            Context context3 = context;
                            i7 i7Var2 = new i7(context3, i19, 0, false, r10Var2, w10Var2, null, h6Var2, 5);
                            i7Var2.g3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.F8, i8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ot otVar2 = new ot(context3, i8Var.J0);
                            otVar2.setTextSize(1, 16.0f);
                            otVar2.setInputType(573441);
                            otVar2.setRawInputType(573441);
                            org.telegram.ui.ActionBar.t6.D(otVar2, org.telegram.ui.ActionBar.m6.A6, i8Var.J0);
                            org.telegram.ui.ActionBar.t6.l(otVar2, 30, org.telegram.ui.ActionBar.m6.G6, i8Var.J0);
                            otVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            otVar2.setCursorWidth(1.5f);
                            otVar2.setHint(hd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.t6.U(otVar2, org.telegram.ui.ActionBar.m6.E8, i8Var.J0);
                            otVar2.setBackground(null);
                            frameLayout2.addView(otVar2, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            otVar2.addTextChangedListener(new v(strArr2, i7Var2, false, 5));
                            if (arrayList2.size() > 8) {
                                a70Var2.r(frameLayout2, ma.o(-1, 44));
                                a70Var2.k();
                            }
                            if (!x7Var2.k.isEmpty()) {
                                a70Var2.c(R.drawable.msg_select, hd.N0(2131745474, null), new a8(h8Var2, 1), false);
                            }
                            a70Var2.q(i7Var2);
                            a70Var2.a0();
                            break;
                        }
                        break;
                    default:
                        x7 x7Var3 = h8Var2.c;
                        if (!x7Var3.h.isEmpty()) {
                            final a70 a70Var3 = new a70(i8Var.c, i8Var.J0, i8Var.Z1, false, true, false);
                            a70Var3.t = false;
                            a70Var3.b0 = true;
                            a70Var3.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            a70Var3.U = true;
                            a70Var3.p = new e6(a70Var3, 5);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(x7Var3.h);
                            Collections.sort(arrayList3, new Comparator() { // from class: bi.c8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i14) {
                                        case 0:
                                            h8 h8Var3 = h8Var2;
                                            Integer num = (Integer) h8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) h8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            h8 h8Var4 = h8Var2;
                                            Integer num3 = (Integer) h8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) h8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            h8 h8Var5 = h8Var2;
                                            Integer num5 = (Integer) h8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) h8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i20 = i8Var.a;
                            r10 r10Var3 = new r10() { // from class: bi.y7
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.r10
                                public final void a(Object obj, Object obj2) {
                                    int i182 = i13;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    h8 h8Var3 = h8Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i182) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            x7 x7Var22 = h8Var3.c;
                                            boolean isEmpty = x7Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i192 = 0;
                                            while (i192 < size) {
                                                Object obj3 = arrayList22.get(i192);
                                                i192++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = x7Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) x7Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i202 = r7.b;
                                                    o41 K = o41.K(r7.class);
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
                                                arrayList32.add(m7.i(hd.N0(2131749993, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            x7 x7Var32 = h8Var3.c;
                                            boolean isEmpty2 = x7Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList22.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = x7Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) x7Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = j7.b;
                                                    o41 K2 = o41.K(j7.class);
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
                                                arrayList4.add(m7.i(hd.N0(2131749998, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            x7 x7Var4 = h8Var3.c;
                                            boolean isEmpty3 = x7Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList22.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = x7Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) x7Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = u7.b;
                                                    o41 K3 = o41.K(u7.class);
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
                                                arrayList5.add(m7.i(hd.N0(2131749991, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            w10 w10Var3 = new w10() { // from class: bi.z7
                                @Override // org.telegram.messenger.w10
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    o41 o41Var = (o41) obj;
                                    switch (i13) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) o41Var.H).document.id;
                                            x7 x7Var22 = h8Var2.c;
                                            HashSet hashSet = x7Var22.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = x7Var22.f;
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
                                            x7Var22.m();
                                            a70Var3.v();
                                            break;
                                        case 1:
                                            int i192 = ((TL_stars.starGiftAttributeBackdrop) o41Var.H).backdrop_id;
                                            x7 x7Var32 = h8Var2.c;
                                            HashSet hashSet2 = x7Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i192))) {
                                                hashSet2.remove(Integer.valueOf(i192));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = x7Var32.g;
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
                                            x7Var32.m();
                                            a70Var3.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) o41Var.H).document.id;
                                            x7 x7Var4 = h8Var2.c;
                                            HashSet hashSet3 = x7Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = x7Var4.h;
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
                                            x7Var4.m();
                                            a70Var3.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.h6 h6Var3 = i8Var.J0;
                            Context context4 = context;
                            i7 i7Var3 = new i7(context4, i20, 0, false, r10Var3, w10Var3, null, h6Var3, 6);
                            i7Var3.g3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.t6.s(imageView3, org.telegram.ui.ActionBar.m6.F8, i8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ot otVar3 = new ot(context4, i8Var.J0);
                            otVar3.setTextSize(1, 16.0f);
                            otVar3.setInputType(573441);
                            otVar3.setRawInputType(573441);
                            org.telegram.ui.ActionBar.t6.D(otVar3, org.telegram.ui.ActionBar.m6.A6, i8Var.J0);
                            org.telegram.ui.ActionBar.t6.l(otVar3, 30, org.telegram.ui.ActionBar.m6.G6, i8Var.J0);
                            otVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            otVar3.setCursorWidth(1.5f);
                            otVar3.setHint(hd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.t6.U(otVar3, org.telegram.ui.ActionBar.m6.E8, i8Var.J0);
                            otVar3.setBackground(null);
                            frameLayout3.addView(otVar3, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            otVar3.addTextChangedListener(new v(strArr3, i7Var3, false, 6));
                            if (arrayList3.size() > 8) {
                                a70Var3.r(frameLayout3, ma.o(-1, 44));
                                a70Var3.k();
                            }
                            if (!x7Var3.l.isEmpty()) {
                                a70Var3.c(R.drawable.msg_select, hd.N0(2131745474, null), new a8(h8Var2, 2), false);
                            }
                            a70Var3.q(i7Var3);
                            a70Var3.a0();
                            break;
                        }
                        break;
                }
            }
        });
        o7 o7Var4 = new o7(context, this.J0, false);
        this.Z1 = o7Var4;
        o7Var4.setValue(hd.N0(2131750363, null));
        linearLayout.addView(o7Var4, ma.t(-2, -2, 16, 0, 0, 0, 0));
        o7Var4.setOnClickListener(new View.OnClickListener(this) { // from class: bi.f8
            public final /* synthetic */ i8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i122 = i7;
                final h8 h8Var2 = h8Var;
                i8 i8Var = this.b;
                final int i13 = 2;
                final int i14 = 1;
                switch (i122) {
                    case 0:
                        x7 x7Var = h8Var2.c;
                        if (!x7Var.f.isEmpty()) {
                            final a70 a70Var = new a70(i8Var.c, i8Var.J0, i8Var.X1, false, true, false);
                            a70Var.t = false;
                            a70Var.b0 = true;
                            a70Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            a70Var.U = true;
                            a70Var.p = new e6(a70Var, 6);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(x7Var.f);
                            final int i15 = 2;
                            Collections.sort(arrayList, new Comparator() { // from class: bi.c8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i15) {
                                        case 0:
                                            h8 h8Var3 = h8Var2;
                                            Integer num = (Integer) h8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) h8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            h8 h8Var4 = h8Var2;
                                            Integer num3 = (Integer) h8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) h8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            h8 h8Var5 = h8Var2;
                                            Integer num5 = (Integer) h8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) h8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i16 = i8Var.a;
                            final int i17 = 0;
                            r10 r10Var = new r10() { // from class: bi.y7
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.r10
                                public final void a(Object obj, Object obj2) {
                                    int i182 = i17;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList;
                                    h8 h8Var3 = h8Var2;
                                    String[] strArr22 = strArr;
                                    switch (i182) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            x7 x7Var22 = h8Var3.c;
                                            boolean isEmpty = x7Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i192 = 0;
                                            while (i192 < size) {
                                                Object obj3 = arrayList22.get(i192);
                                                i192++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = x7Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) x7Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i202 = r7.b;
                                                    o41 K = o41.K(r7.class);
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
                                                arrayList32.add(m7.i(hd.N0(2131749993, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            x7 x7Var32 = h8Var3.c;
                                            boolean isEmpty2 = x7Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList22.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = x7Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) x7Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = j7.b;
                                                    o41 K2 = o41.K(j7.class);
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
                                                arrayList4.add(m7.i(hd.N0(2131749998, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            x7 x7Var4 = h8Var3.c;
                                            boolean isEmpty3 = x7Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList22.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = x7Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) x7Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = u7.b;
                                                    o41 K3 = o41.K(u7.class);
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
                                                arrayList5.add(m7.i(hd.N0(2131749991, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            w10 w10Var = new w10() { // from class: bi.z7
                                @Override // org.telegram.messenger.w10
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    o41 o41Var = (o41) obj;
                                    switch (i17) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) o41Var.H).document.id;
                                            x7 x7Var22 = h8Var2.c;
                                            HashSet hashSet = x7Var22.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = x7Var22.f;
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
                                            x7Var22.m();
                                            a70Var.v();
                                            break;
                                        case 1:
                                            int i192 = ((TL_stars.starGiftAttributeBackdrop) o41Var.H).backdrop_id;
                                            x7 x7Var32 = h8Var2.c;
                                            HashSet hashSet2 = x7Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i192))) {
                                                hashSet2.remove(Integer.valueOf(i192));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = x7Var32.g;
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
                                            x7Var32.m();
                                            a70Var.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) o41Var.H).document.id;
                                            x7 x7Var4 = h8Var2.c;
                                            HashSet hashSet3 = x7Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = x7Var4.h;
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
                                            x7Var4.m();
                                            a70Var.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.h6 h6Var = i8Var.J0;
                            Context context2 = context;
                            i7 i7Var = new i7(context2, i16, 0, false, r10Var, w10Var, null, h6Var, 4);
                            i7Var.g3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.F8, i8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ot otVar = new ot(context2, i8Var.J0);
                            otVar.setTextSize(1, 16.0f);
                            otVar.setInputType(573441);
                            otVar.setRawInputType(573441);
                            org.telegram.ui.ActionBar.t6.D(otVar, org.telegram.ui.ActionBar.m6.A6, i8Var.J0);
                            org.telegram.ui.ActionBar.t6.l(otVar, 30, org.telegram.ui.ActionBar.m6.G6, i8Var.J0);
                            otVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            otVar.setCursorWidth(1.5f);
                            otVar.setHint(hd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.t6.U(otVar, org.telegram.ui.ActionBar.m6.E8, i8Var.J0);
                            otVar.setBackground(null);
                            frameLayout.addView(otVar, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            otVar.addTextChangedListener(new v(strArr, i7Var, false, 4));
                            if (arrayList.size() > 8) {
                                a70Var.r(frameLayout, ma.o(-1, 44));
                                a70Var.k();
                            }
                            if (!x7Var.j.isEmpty()) {
                                a70Var.c(R.drawable.msg_select, hd.N0(2131745474, null), new a8(h8Var2, 0), false);
                            }
                            a70Var.q(i7Var);
                            a70Var.a0();
                            break;
                        }
                        break;
                    case 1:
                        x7 x7Var2 = h8Var2.c;
                        if (!x7Var2.g.isEmpty()) {
                            final a70 a70Var2 = new a70(i8Var.c, i8Var.J0, i8Var.Y1, false, true, false);
                            a70Var2.t = false;
                            a70Var2.b0 = true;
                            a70Var2.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            a70Var2.U = true;
                            a70Var2.p = new e6(a70Var2, 4);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(x7Var2.g);
                            final int i18 = 0;
                            Collections.sort(arrayList2, new Comparator() { // from class: bi.c8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i18) {
                                        case 0:
                                            h8 h8Var3 = h8Var2;
                                            Integer num = (Integer) h8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) h8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            h8 h8Var4 = h8Var2;
                                            Integer num3 = (Integer) h8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) h8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            h8 h8Var5 = h8Var2;
                                            Integer num5 = (Integer) h8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) h8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i19 = i8Var.a;
                            r10 r10Var2 = new r10() { // from class: bi.y7
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.r10
                                public final void a(Object obj, Object obj2) {
                                    int i182 = i14;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    h8 h8Var3 = h8Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i182) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            x7 x7Var22 = h8Var3.c;
                                            boolean isEmpty = x7Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i192 = 0;
                                            while (i192 < size) {
                                                Object obj3 = arrayList22.get(i192);
                                                i192++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = x7Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) x7Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i202 = r7.b;
                                                    o41 K = o41.K(r7.class);
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
                                                arrayList32.add(m7.i(hd.N0(2131749993, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            x7 x7Var32 = h8Var3.c;
                                            boolean isEmpty2 = x7Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList22.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = x7Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) x7Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = j7.b;
                                                    o41 K2 = o41.K(j7.class);
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
                                                arrayList4.add(m7.i(hd.N0(2131749998, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            x7 x7Var4 = h8Var3.c;
                                            boolean isEmpty3 = x7Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList22.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = x7Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) x7Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = u7.b;
                                                    o41 K3 = o41.K(u7.class);
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
                                                arrayList5.add(m7.i(hd.N0(2131749991, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            w10 w10Var2 = new w10() { // from class: bi.z7
                                @Override // org.telegram.messenger.w10
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    o41 o41Var = (o41) obj;
                                    switch (i14) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) o41Var.H).document.id;
                                            x7 x7Var22 = h8Var2.c;
                                            HashSet hashSet = x7Var22.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = x7Var22.f;
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
                                            x7Var22.m();
                                            a70Var2.v();
                                            break;
                                        case 1:
                                            int i192 = ((TL_stars.starGiftAttributeBackdrop) o41Var.H).backdrop_id;
                                            x7 x7Var32 = h8Var2.c;
                                            HashSet hashSet2 = x7Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i192))) {
                                                hashSet2.remove(Integer.valueOf(i192));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = x7Var32.g;
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
                                            x7Var32.m();
                                            a70Var2.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) o41Var.H).document.id;
                                            x7 x7Var4 = h8Var2.c;
                                            HashSet hashSet3 = x7Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = x7Var4.h;
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
                                            x7Var4.m();
                                            a70Var2.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.h6 h6Var2 = i8Var.J0;
                            Context context3 = context;
                            i7 i7Var2 = new i7(context3, i19, 0, false, r10Var2, w10Var2, null, h6Var2, 5);
                            i7Var2.g3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.F8, i8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ot otVar2 = new ot(context3, i8Var.J0);
                            otVar2.setTextSize(1, 16.0f);
                            otVar2.setInputType(573441);
                            otVar2.setRawInputType(573441);
                            org.telegram.ui.ActionBar.t6.D(otVar2, org.telegram.ui.ActionBar.m6.A6, i8Var.J0);
                            org.telegram.ui.ActionBar.t6.l(otVar2, 30, org.telegram.ui.ActionBar.m6.G6, i8Var.J0);
                            otVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            otVar2.setCursorWidth(1.5f);
                            otVar2.setHint(hd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.t6.U(otVar2, org.telegram.ui.ActionBar.m6.E8, i8Var.J0);
                            otVar2.setBackground(null);
                            frameLayout2.addView(otVar2, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            otVar2.addTextChangedListener(new v(strArr2, i7Var2, false, 5));
                            if (arrayList2.size() > 8) {
                                a70Var2.r(frameLayout2, ma.o(-1, 44));
                                a70Var2.k();
                            }
                            if (!x7Var2.k.isEmpty()) {
                                a70Var2.c(R.drawable.msg_select, hd.N0(2131745474, null), new a8(h8Var2, 1), false);
                            }
                            a70Var2.q(i7Var2);
                            a70Var2.a0();
                            break;
                        }
                        break;
                    default:
                        x7 x7Var3 = h8Var2.c;
                        if (!x7Var3.h.isEmpty()) {
                            final a70 a70Var3 = new a70(i8Var.c, i8Var.J0, i8Var.Z1, false, true, false);
                            a70Var3.t = false;
                            a70Var3.b0 = true;
                            a70Var3.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            a70Var3.U = true;
                            a70Var3.p = new e6(a70Var3, 5);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(x7Var3.h);
                            Collections.sort(arrayList3, new Comparator() { // from class: bi.c8
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i14) {
                                        case 0:
                                            h8 h8Var3 = h8Var2;
                                            Integer num = (Integer) h8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) h8Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            h8 h8Var4 = h8Var2;
                                            Integer num3 = (Integer) h8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) h8Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            h8 h8Var5 = h8Var2;
                                            Integer num5 = (Integer) h8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) h8Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i20 = i8Var.a;
                            r10 r10Var3 = new r10() { // from class: bi.y7
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.r10
                                public final void a(Object obj, Object obj2) {
                                    int i182 = i13;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    h8 h8Var3 = h8Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i182) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            x7 x7Var22 = h8Var3.c;
                                            boolean isEmpty = x7Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i192 = 0;
                                            while (i192 < size) {
                                                Object obj3 = arrayList22.get(i192);
                                                i192++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = x7Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) x7Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i202 = r7.b;
                                                    o41 K = o41.K(r7.class);
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
                                                arrayList32.add(m7.i(hd.N0(2131749993, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            x7 x7Var32 = h8Var3.c;
                                            boolean isEmpty2 = x7Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList22.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = x7Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) x7Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = j7.b;
                                                    o41 K2 = o41.K(j7.class);
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
                                                arrayList4.add(m7.i(hd.N0(2131749998, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            x7 x7Var4 = h8Var3.c;
                                            boolean isEmpty3 = x7Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList22.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = x7Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) x7Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = u7.b;
                                                    o41 K3 = o41.K(u7.class);
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
                                                arrayList5.add(m7.i(hd.N0(2131749991, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            w10 w10Var3 = new w10() { // from class: bi.z7
                                @Override // org.telegram.messenger.w10
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    o41 o41Var = (o41) obj;
                                    switch (i13) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) o41Var.H).document.id;
                                            x7 x7Var22 = h8Var2.c;
                                            HashSet hashSet = x7Var22.j;
                                            if (hashSet.contains(Long.valueOf(j3))) {
                                                hashSet.remove(Long.valueOf(j3));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = x7Var22.f;
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
                                            x7Var22.m();
                                            a70Var3.v();
                                            break;
                                        case 1:
                                            int i192 = ((TL_stars.starGiftAttributeBackdrop) o41Var.H).backdrop_id;
                                            x7 x7Var32 = h8Var2.c;
                                            HashSet hashSet2 = x7Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i192))) {
                                                hashSet2.remove(Integer.valueOf(i192));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = x7Var32.g;
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
                                            x7Var32.m();
                                            a70Var3.v();
                                            break;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) o41Var.H).document.id;
                                            x7 x7Var4 = h8Var2.c;
                                            HashSet hashSet3 = x7Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j11))) {
                                                hashSet3.remove(Long.valueOf(j11));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = x7Var4.h;
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
                                            x7Var4.m();
                                            a70Var3.v();
                                            break;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.h6 h6Var3 = i8Var.J0;
                            Context context4 = context;
                            i7 i7Var3 = new i7(context4, i20, 0, false, r10Var3, w10Var3, null, h6Var3, 6);
                            i7Var3.g3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(R.drawable.smiles_inputsearch);
                            org.telegram.ui.ActionBar.t6.s(imageView3, org.telegram.ui.ActionBar.m6.F8, i8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ot otVar3 = new ot(context4, i8Var.J0);
                            otVar3.setTextSize(1, 16.0f);
                            otVar3.setInputType(573441);
                            otVar3.setRawInputType(573441);
                            org.telegram.ui.ActionBar.t6.D(otVar3, org.telegram.ui.ActionBar.m6.A6, i8Var.J0);
                            org.telegram.ui.ActionBar.t6.l(otVar3, 30, org.telegram.ui.ActionBar.m6.G6, i8Var.J0);
                            otVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            otVar3.setCursorWidth(1.5f);
                            otVar3.setHint(hd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.t6.U(otVar3, org.telegram.ui.ActionBar.m6.E8, i8Var.J0);
                            otVar3.setBackground(null);
                            frameLayout3.addView(otVar3, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            otVar3.addTextChangedListener(new v(strArr3, i7Var3, false, 6));
                            if (arrayList3.size() > 8) {
                                a70Var3.r(frameLayout3, ma.o(-1, 44));
                                a70Var3.k();
                            }
                            if (!x7Var3.l.isEmpty()) {
                                a70Var3.c(R.drawable.msg_select, hd.N0(2131745474, null), new a8(h8Var2, 2), false);
                            }
                            a70Var3.q(i7Var3);
                            a70Var3.a0();
                            break;
                        }
                        break;
                }
            }
        });
        getContext();
        v4.t tVar = new v4.t(3);
        tVar.O = new w2(this, i12);
        this.o1.setLayoutManager(tVar);
        this.o1.setOnItemClickListener(new ab.g(i11, this, h8Var));
        this.o1.setPadding(org.telegram.messenger.g0.L(8.0f) + this.u0, 0, org.telegram.messenger.g0.L(8.0f) + this.u0, 0);
        this.o1.setOnScrollListener(new u1(this, i7));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(nr.h);
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
        org.telegram.messenger.g0.m2(new ai.h0(k4Var, 11), 12.0f, 12, new ArrayList());
        k4Var.setPivotY(0.0f);
        this.c.addView(k4Var, ma.e(-1, -2, 55));
        this.e2.O(false);
        h8Var.d = new b8(this, i12);
    }

    @Override // org.telegram.ui.Components.sa
    public final dk0 M0(ek0 ek0Var) {
        g8 g8Var = new g8(this, ek0Var, getContext(), this.a, new b(this, 10), this.J0, 0);
        this.e2 = g8Var;
        return g8Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        String str = this.T1;
        return str != null ? str : hd.N0(2131749754, null);
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
        o41 G;
        int i7 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            ek0 ek0Var = this.o1;
            if (i7 >= ek0Var.getChildCount()) {
                break;
            }
            View childAt = ek0Var.getChildAt(i7);
            if ((childAt instanceof yz) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.e2.G(R)) != null) {
                if (G.d < 10) {
                    z10 = true;
                } else {
                    z11 = true;
                }
            }
            i7++;
        }
        h8 h8Var = this.U1;
        if (z10) {
            h8Var.b.a();
        }
        if (z11) {
            h8Var.c.l(false);
        }
    }
}
