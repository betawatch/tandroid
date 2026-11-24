// default package

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
import org.telegram.messenger.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class nx2 extends j39 {
    public final Context r;
    public final HashMap s = new HashMap();
    public final ArrayList w = new ArrayList();
    public final /* synthetic */ qx2 x;

    public nx2(qx2 qx2Var, Context context, ArrayList arrayList, boolean z) {
        Comparator saVar;
        this.x = qx2Var;
        this.r = context;
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                mx2 mx2Var = (mx2) arrayList.get(i);
                String upperCase = mx2Var.a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.s.put(upperCase, arrayList2);
                    this.w.add(upperCase);
                }
                arrayList2.add(mx2Var);
            }
        } else {
            try {
                InputStream open = a.b.getResources().getAssets().open("countries.txt");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(";");
                    mx2 mx2Var2 = new mx2();
                    mx2Var2.a = split[2];
                    mx2Var2.c = split[0];
                    String str = split[1];
                    mx2Var2.d = str;
                    if (!str.equals("FT") || !z) {
                        String upperCase2 = mx2Var2.a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.s.put(upperCase2, arrayList3);
                            this.w.add(upperCase2);
                        }
                        arrayList3.add(mx2Var2);
                    }
                }
                bufferedReader.close();
                open.close();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Collator collator = Collator.getInstance(k96.D0().y != null ? k96.D0().y : Locale.getDefault());
            Objects.requireNonNull(collator);
            saVar = new in0(collator, (byte) 0);
        } else {
            saVar = new sa((byte) 9);
        }
        Collections.sort(this.w, saVar);
        Iterator it = this.s.values().iterator();
        while (it.hasNext()) {
            Collections.sort((ArrayList) it.next(), new jn0(saVar, (byte) 2));
        }
    }

    @Override // w29
    public final String F(int i) {
        int S = S(i);
        ArrayList arrayList = this.w;
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        return (String) arrayList.get(S);
    }

    @Override // w29
    public final void G(o39 o39Var, float f, int[] iArr) {
        iArr[0] = (int) (b() * f);
        iArr[1] = 0;
    }

    @Override // j39
    public final int M(int i) {
        ArrayList arrayList = this.w;
        int size = ((ArrayList) this.s.get(arrayList.get(i))).size();
        return i != arrayList.size() + (-1) ? size + 1 : size;
    }

    @Override // j39
    public final int P(int i, int i2) {
        return i2 < ((ArrayList) this.s.get(this.w.get(i))).size() ? 0 : 1;
    }

    @Override // j39
    public final int R() {
        return this.w.size();
    }

    @Override // j39
    public final View T(int i, View view) {
        return null;
    }

    @Override // j39
    public final boolean V(int i, int i2, s49 s49Var) {
        return i2 < ((ArrayList) this.s.get(this.w.get(i))).size();
    }

    @Override // j39
    public final void W(int i, int i2, s49 s49Var) {
        if (s49Var.f == 0) {
            mx2 mx2Var = (mx2) ((ArrayList) this.s.get(this.w.get(i))).get(i2);
            uib uibVar = (uib) s49Var.a;
            String str = null;
            CharSequence m = vu3.m(qx2.Z(mx2Var), uibVar.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
            if (this.x.h) {
                str = "+" + mx2Var.c;
            }
            uibVar.c(m, str, false, false);
        }
    }

    @Override // j39
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final mx2 O(int i, int i2) {
        if (i >= 0) {
            ArrayList arrayList = this.w;
            if (i < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.s.get(arrayList.get(i));
                if (i2 >= 0 && i2 < arrayList2.size()) {
                    return (mx2) arrayList2.get(i2);
                }
            }
        }
        return null;
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View Y;
        Context context = this.r;
        if (i != 0) {
            Y = new qo3(context, null);
            Y.setPadding(gl.L(24.0f), gl.L(8.0f), gl.L(24.0f), gl.L(8.0f));
        } else {
            Y = qx2.Y(context);
        }
        return new y29(Y);
    }
}
