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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class nt extends org.telegram.ui.Components.sk0 {
    public final Context r;
    public final HashMap s = new HashMap();
    public final ArrayList v = new ArrayList();
    public final /* synthetic */ qt w;

    public nt(qt qtVar, Context context, ArrayList arrayList, boolean z10) {
        Comparator eVar;
        this.w = qtVar;
        this.r = context;
        if (arrayList != null) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                lt ltVar = (lt) arrayList.get(i9);
                String upperCase = ltVar.a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.s.put(upperCase, arrayList2);
                    this.v.add(upperCase);
                }
                arrayList2.add(ltVar);
            }
        } else {
            try {
                InputStream open = ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(";");
                    lt ltVar2 = new lt();
                    ltVar2.a = split[2];
                    ltVar2.c = split[0];
                    String str = split[1];
                    ltVar2.d = str;
                    if (!str.equals("FT") || !z10) {
                        String upperCase2 = ltVar2.a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.s.put(upperCase2, arrayList3);
                            this.v.add(upperCase2);
                        }
                        arrayList3.add(ltVar2);
                    }
                }
                bufferedReader.close();
                open.close();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Collator collator = Collator.getInstance(LocaleController.getInstance().getCurrentLocale() != null ? LocaleController.getInstance().getCurrentLocale() : Locale.getDefault());
            Objects.requireNonNull(collator);
            eVar = new bg.l0(collator, 0);
        } else {
            eVar = new a5.e(10);
        }
        Collections.sort(this.v, eVar);
        Iterator it = this.s.values().iterator();
        while (it.hasNext()) {
            Collections.sort((ArrayList) it.next(), new mt(eVar, 0));
        }
    }

    @Override // org.telegram.ui.Components.gk0
    public final String F(int i9) {
        int S = S(i9);
        ArrayList arrayList = this.v;
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        return (String) arrayList.get(S);
    }

    @Override // org.telegram.ui.Components.gk0
    public final void G(org.telegram.ui.Components.wk0 wk0Var, float f10, int[] iArr) {
        iArr[0] = (int) (h() * f10);
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.sk0
    public final int M(int i9) {
        ArrayList arrayList = this.v;
        int size = ((ArrayList) this.s.get(arrayList.get(i9))).size();
        return i9 != arrayList.size() + (-1) ? size + 1 : size;
    }

    @Override // org.telegram.ui.Components.sk0
    public final int P(int i9, int i10) {
        return i10 < ((ArrayList) this.s.get(this.v.get(i9))).size() ? 0 : 1;
    }

    @Override // org.telegram.ui.Components.sk0
    public final int R() {
        return this.v.size();
    }

    @Override // org.telegram.ui.Components.sk0
    public final View T(int i9, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean V(int i9, int i10, f2.q1 q1Var) {
        return i10 < ((ArrayList) this.s.get(this.v.get(i9))).size();
    }

    @Override // org.telegram.ui.Components.sk0
    public final void W(int i9, int i10, f2.q1 q1Var) {
        String str;
        if (q1Var.f == 0) {
            lt ltVar = (lt) ((ArrayList) this.s.get(this.v.get(i9))).get(i10);
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) q1Var.a;
            CharSequence replaceEmoji = Emoji.replaceEmoji(qt.U(ltVar), baVar.getTextView().getPaint().getFontMetricsInt(), false);
            if (this.w.h) {
                str = "+" + ltVar.c;
            } else {
                str = null;
            }
            baVar.c(replaceEmoji, str, false, false);
        }
    }

    @Override // org.telegram.ui.Components.sk0
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final lt O(int i9, int i10) {
        if (i9 >= 0) {
            ArrayList arrayList = this.v;
            if (i9 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.s.get(arrayList.get(i9));
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    return (lt) arrayList2.get(i10);
                }
            }
        }
        return null;
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View T;
        Context context = this.r;
        if (i9 != 0) {
            T = new org.telegram.ui.Cells.c3(context, null);
            T.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        } else {
            T = qt.T(context);
        }
        return new org.telegram.ui.Components.ik0(T);
    }
}
