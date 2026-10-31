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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pt extends org.telegram.ui.Components.ok0 {
    public final Context r;
    public final HashMap s = new HashMap();
    public final ArrayList w = new ArrayList();
    public final /* synthetic */ rt x;

    public pt(rt rtVar, Context context, ArrayList arrayList, boolean z10) {
        Comparator dVar;
        this.x = rtVar;
        this.r = context;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                nt ntVar = (nt) arrayList.get(i10);
                String upperCase = ntVar.a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.s.put(upperCase, arrayList2);
                    this.w.add(upperCase);
                }
                arrayList2.add(ntVar);
            }
        } else {
            try {
                InputStream open = org.telegram.messenger.w0.b.getResources().getAssets().open("countries.txt");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(";");
                    nt ntVar2 = new nt();
                    ntVar2.a = split[2];
                    ntVar2.c = split[0];
                    String str = split[1];
                    ntVar2.d = str;
                    if (!str.equals("FT") || !z10) {
                        String upperCase2 = ntVar2.a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.s.put(upperCase2, arrayList3);
                            this.w.add(upperCase2);
                        }
                        arrayList3.add(ntVar2);
                    }
                }
                bufferedReader.close();
                open.close();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Collator collator = Collator.getInstance(org.telegram.messenger.cd.D0().y != null ? org.telegram.messenger.cd.D0().y : Locale.getDefault());
            Objects.requireNonNull(collator);
            dVar = new bi.v6(collator, 2);
        } else {
            dVar = new a4.d(11);
        }
        Collections.sort(this.w, dVar);
        Iterator it = this.s.values().iterator();
        while (it.hasNext()) {
            Collections.sort((ArrayList) it.next(), new ot(dVar, 0));
        }
    }

    @Override // org.telegram.ui.Components.ak0
    public final String F(int i10) {
        int S = S(i10);
        ArrayList arrayList = this.w;
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        return (String) arrayList.get(S);
    }

    @Override // org.telegram.ui.Components.ak0
    public final void G(org.telegram.ui.Components.tk0 tk0Var, float f7, int[] iArr) {
        iArr[0] = (int) (b() * f7);
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.ok0
    public final int M(int i10) {
        ArrayList arrayList = this.w;
        int size = ((ArrayList) this.s.get(arrayList.get(i10))).size();
        return i10 != arrayList.size() + (-1) ? size + 1 : size;
    }

    @Override // org.telegram.ui.Components.ok0
    public final int P(int i10, int i11) {
        return i11 < ((ArrayList) this.s.get(this.w.get(i10))).size() ? 0 : 1;
    }

    @Override // org.telegram.ui.Components.ok0
    public final int R() {
        return this.w.size();
    }

    @Override // org.telegram.ui.Components.ok0
    public final View T(int i10, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.ok0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        return i11 < ((ArrayList) this.s.get(this.w.get(i10))).size();
    }

    @Override // org.telegram.ui.Components.ok0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        if (c1Var.f == 0) {
            nt ntVar = (nt) ((ArrayList) this.s.get(this.w.get(i10))).get(i11);
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) c1Var.a;
            String str = null;
            CharSequence m10 = org.telegram.messenger.k6.m(rt.Z(ntVar), x9Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
            if (this.x.h) {
                str = "+" + ntVar.c;
            }
            x9Var.c(m10, str, false, false);
        }
    }

    @Override // org.telegram.ui.Components.ok0
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final nt O(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.w;
            if (i10 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.s.get(arrayList.get(i10));
                if (i11 >= 0 && i11 < arrayList2.size()) {
                    return (nt) arrayList2.get(i11);
                }
            }
        }
        return null;
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View Y;
        Context context = this.r;
        if (i10 != 0) {
            Y = new org.telegram.ui.Cells.g3(context, null);
            Y.setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(8.0f));
        } else {
            Y = rt.Y(context);
        }
        return new org.telegram.ui.Components.ck0(Y);
    }
}
