package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import org.telegram.messenger.a8;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class q6 implements q0.a {
    public final IdentityHashMap a = new IdentityHashMap();
    public boolean b;
    public int c;
    public HashSet d;
    public boolean e;

    public final void a() {
        this.a.clear();
        this.d = null;
        this.e = false;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        b((View) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view) {
        v4.u0 recycledViewPool;
        if (view == 0 || this.a.put(view, Boolean.TRUE) != null) {
            return;
        }
        int i7 = 0;
        if (this.c == 0) {
            if (view instanceof a6) {
                try {
                    ((a6) view).updateColors();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
            try {
                r6.b0(view);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            Drawable background = view.getBackground();
            if (background instanceof a6) {
                try {
                    ((a6) background).updateColors();
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
                background.invalidateSelf();
            }
            Drawable foreground = view.getForeground();
            if (foreground instanceof a6) {
                try {
                    ((a6) foreground).updateColors();
                } catch (Exception e13) {
                    a8.g(e13, true);
                }
                foreground.invalidateSelf();
            }
            view.invalidate();
        } else {
            HashSet hashSet = this.d;
            if (view instanceof a6) {
                ((a6) view).addColorKeys(hashSet);
            }
            m6 p10 = r6.p(view, false);
            if (p10 != null) {
                for (int i10 = 0; i10 < 6; i10++) {
                    l6 l6Var = p10.a[i10];
                    if (l6Var != null) {
                        r6.g(l6Var, hashSet);
                    }
                }
                if (p10.b != null) {
                    for (int i11 = 0; i11 < p10.b.size(); i11++) {
                        r6.g((l6) p10.b.get(i11), hashSet);
                    }
                }
                if (p10.c != null) {
                    for (int i12 = 0; i12 < p10.c.size(); i12++) {
                        r6.g((l6) p10.c.get(i12), hashSet);
                    }
                }
                l6 l6Var2 = p10.e;
                if (l6Var2 != null) {
                    r6.g(l6Var2, hashSet);
                }
                l6 l6Var3 = p10.f;
                if (l6Var3 != null) {
                    r6.g(l6Var3, hashSet);
                }
            }
        }
        if (!(view instanceof RecyclerView)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                while (i7 < viewGroup.getChildCount()) {
                    b(viewGroup.getChildAt(i7));
                    i7++;
                }
                return;
            }
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        boolean z9 = this.b;
        for (int i13 = 0; i13 < recyclerView.getChildCount(); i13++) {
            b(recyclerView.getChildAt(i13));
        }
        for (int i14 = 0; i14 < recyclerView.getHiddenChildCount(); i14++) {
            b(recyclerView.V(i14));
        }
        for (int i15 = 0; i15 < recyclerView.getAttachedScrapChildCount(); i15++) {
            b(recyclerView.O(i15));
        }
        for (int i16 = 0; i16 < recyclerView.getCachedChildCount(); i16++) {
            b(recyclerView.P(i16));
        }
        if (!z9 || (recycledViewPool = recyclerView.getRecycledViewPool()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = recycledViewPool.a;
        for (int i17 = 0; i17 < sparseArray.size(); i17++) {
            ArrayList arrayList2 = ((v4.t0) sparseArray.valueAt(i17)).a;
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                arrayList.add(((v4.d1) arrayList2.get(i18)).a);
            }
        }
        while (i7 < arrayList.size()) {
            b((View) arrayList.get(i7));
            i7++;
        }
    }
}
