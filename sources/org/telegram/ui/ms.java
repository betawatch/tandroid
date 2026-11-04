package org.telegram.ui;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ms extends org.telegram.ui.Components.oj0 {
    public final Context r;
    public final HashMap s = new HashMap();
    public final ArrayList w = new ArrayList();
    public final /* synthetic */ os x;

    public ms(os osVar, Context context, ArrayList arrayList, boolean z10) {
        Comparator i1Var;
        this.x = osVar;
        this.r = context;
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ks ksVar = (ks) arrayList.get(i3);
                String upperCase = ksVar.a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.s.put(upperCase, arrayList2);
                    this.w.add(upperCase);
                }
                arrayList2.add(ksVar);
            }
        } else {
            try {
                InputStream open = org.telegram.messenger.t0.b.getResources().getAssets().open("countries.txt");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(";");
                    ks ksVar2 = new ks();
                    ksVar2.a = split[2];
                    ksVar2.c = split[0];
                    String str = split[1];
                    ksVar2.d = str;
                    if (!str.equals("FT") || !z10) {
                        String upperCase2 = ksVar2.a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.s.put(upperCase2, arrayList3);
                            this.w.add(upperCase2);
                        }
                        arrayList3.add(ksVar2);
                    }
                }
                bufferedReader.close();
                open.close();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Collator collator = Collator.getInstance(org.telegram.messenger.bd.E0().y != null ? org.telegram.messenger.bd.E0().y : Locale.getDefault());
            Objects.requireNonNull(collator);
            i1Var = new ci.y4(collator, 6);
        } else {
            i1Var = new vg.i1(1);
        }
        Collections.sort(this.w, i1Var);
        Iterator it = this.s.values().iterator();
        while (it.hasNext()) {
            Collections.sort((ArrayList) it.next(), new ls(i1Var, 0));
        }
    }

    @Override // org.telegram.ui.Components.zi0
    public final String F(int i3) {
        int S = S(i3);
        ArrayList arrayList = this.w;
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        return (String) arrayList.get(S);
    }

    @Override // org.telegram.ui.Components.zi0
    public final void G(org.telegram.ui.Components.tj0 tj0Var, float f10, int[] iArr) {
        iArr[0] = (int) (b() * f10);
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.oj0
    public final int M(int i3) {
        ArrayList arrayList = this.w;
        int size = ((ArrayList) this.s.get(arrayList.get(i3))).size();
        return i3 != arrayList.size() + (-1) ? size + 1 : size;
    }

    @Override // org.telegram.ui.Components.oj0
    public final int P(int i3, int i10) {
        return i10 < ((ArrayList) this.s.get(this.w.get(i3))).size() ? 0 : 1;
    }

    @Override // org.telegram.ui.Components.oj0
    public final int R() {
        return this.w.size();
    }

    @Override // org.telegram.ui.Components.oj0
    public final View T(int i3, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean V(int i3, int i10, u4.d1 d1Var) {
        return i10 < ((ArrayList) this.s.get(this.w.get(i3))).size();
    }

    @Override // org.telegram.ui.Components.oj0
    public final void W(int i3, int i10, u4.d1 d1Var) {
        if (d1Var.f == 0) {
            ks ksVar = (ks) ((ArrayList) this.s.get(this.w.get(i3))).get(i10);
            org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) d1Var.a;
            String str = null;
            CharSequence m10 = org.telegram.messenger.i6.m(os.a0(ksVar), v9Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
            if (this.x.h) {
                str = "+" + ksVar.c;
            }
            v9Var.c(m10, str, false, false);
        }
    }

    @Override // org.telegram.ui.Components.oj0
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final ks O(int i3, int i10) {
        if (i3 >= 0) {
            ArrayList arrayList = this.w;
            if (i3 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.s.get(arrayList.get(i3));
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    return (ks) arrayList2.get(i10);
                }
            }
        }
        return null;
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View Z;
        Context context = this.r;
        if (i3 != 0) {
            Z = new org.telegram.ui.Cells.e3(context, null);
            Z.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f));
        } else {
            Z = os.Z(context);
        }
        return new org.telegram.ui.Components.bj0(Z);
    }
}
