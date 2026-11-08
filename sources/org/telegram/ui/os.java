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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class os extends org.telegram.ui.Components.kj0 {
    public final Context r;
    public final HashMap s = new HashMap();
    public final ArrayList w = new ArrayList();
    public final /* synthetic */ qs x;

    public os(qs qsVar, Context context, ArrayList arrayList, boolean z9) {
        Comparator un0Var;
        this.x = qsVar;
        this.r = context;
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ms msVar = (ms) arrayList.get(i7);
                String upperCase = msVar.a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.s.put(upperCase, arrayList2);
                    this.w.add(upperCase);
                }
                arrayList2.add(msVar);
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
                    ms msVar2 = new ms();
                    msVar2.a = split[2];
                    msVar2.c = split[0];
                    String str = split[1];
                    msVar2.d = str;
                    if (!str.equals("FT") || !z9) {
                        String upperCase2 = msVar2.a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.s.put(upperCase2, arrayList3);
                            this.w.add(upperCase2);
                        }
                        arrayList3.add(msVar2);
                    }
                }
                bufferedReader.close();
                open.close();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Collator collator = Collator.getInstance(org.telegram.messenger.id.E0().y != null ? org.telegram.messenger.id.E0().y : Locale.getDefault());
            Objects.requireNonNull(collator);
            un0Var = new bi.s5(collator, 8);
        } else {
            un0Var = new un0(14);
        }
        Collections.sort(this.w, un0Var);
        Iterator it = this.s.values().iterator();
        while (it.hasNext()) {
            Collections.sort((ArrayList) it.next(), new ns(un0Var, 0));
        }
    }

    @Override // org.telegram.ui.Components.vi0
    public final String F(int i7) {
        int S = S(i7);
        ArrayList arrayList = this.w;
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        return (String) arrayList.get(S);
    }

    @Override // org.telegram.ui.Components.vi0
    public final void G(org.telegram.ui.Components.pj0 pj0Var, float f10, int[] iArr) {
        iArr[0] = (int) (b() * f10);
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.kj0
    public final int M(int i7) {
        ArrayList arrayList = this.w;
        int size = ((ArrayList) this.s.get(arrayList.get(i7))).size();
        return i7 != arrayList.size() + (-1) ? size + 1 : size;
    }

    @Override // org.telegram.ui.Components.kj0
    public final int P(int i7, int i10) {
        return i10 < ((ArrayList) this.s.get(this.w.get(i7))).size() ? 0 : 1;
    }

    @Override // org.telegram.ui.Components.kj0
    public final int R() {
        return this.w.size();
    }

    @Override // org.telegram.ui.Components.kj0
    public final View T(int i7, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.kj0
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        return i10 < ((ArrayList) this.s.get(this.w.get(i7))).size();
    }

    @Override // org.telegram.ui.Components.kj0
    public final void W(int i7, int i10, v4.d1 d1Var) {
        if (d1Var.f == 0) {
            ms msVar = (ms) ((ArrayList) this.s.get(this.w.get(i7))).get(i10);
            org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) d1Var.a;
            String str = null;
            CharSequence m10 = org.telegram.messenger.i6.m(qs.a0(msVar), w9Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
            if (this.x.h) {
                str = "+" + msVar.c;
            }
            w9Var.c(m10, str, false, false);
        }
    }

    @Override // org.telegram.ui.Components.kj0
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final ms O(int i7, int i10) {
        if (i7 >= 0) {
            ArrayList arrayList = this.w;
            if (i7 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.s.get(arrayList.get(i7));
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    return (ms) arrayList2.get(i10);
                }
            }
        }
        return null;
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View Z;
        Context context = this.r;
        if (i7 != 0) {
            Z = new org.telegram.ui.Cells.e3(context, null);
            Z.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f));
        } else {
            Z = qs.Z(context);
        }
        return new org.telegram.ui.Components.xi0(Z);
    }
}
