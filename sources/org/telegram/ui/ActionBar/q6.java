package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        s4.t0 recycledViewPool;
        if (view == 0 || this.a.put(view, Boolean.TRUE) != null) {
            return;
        }
        int i10 = 0;
        if (this.c == 0) {
            if (view instanceof b6) {
                try {
                    ((b6) view).updateColors();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            try {
                r6.d0(view);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            Drawable background = view.getBackground();
            if (background instanceof b6) {
                try {
                    ((b6) background).updateColors();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                background.invalidateSelf();
            }
            Drawable foreground = view.getForeground();
            if (foreground instanceof b6) {
                try {
                    ((b6) foreground).updateColors();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                foreground.invalidateSelf();
            }
            view.invalidate();
        } else {
            HashSet hashSet = this.d;
            if (view instanceof b6) {
                ((b6) view).addColorKeys(hashSet);
            }
            m6 p5 = r6.p(view, false);
            if (p5 != null) {
                for (int i11 = 0; i11 < 6; i11++) {
                    l6 l6Var = p5.a[i11];
                    if (l6Var != null) {
                        r6.g(l6Var, hashSet);
                    }
                }
                if (p5.b != null) {
                    for (int i12 = 0; i12 < p5.b.size(); i12++) {
                        r6.g((l6) p5.b.get(i12), hashSet);
                    }
                }
                if (p5.c != null) {
                    for (int i13 = 0; i13 < p5.c.size(); i13++) {
                        r6.g((l6) p5.c.get(i13), hashSet);
                    }
                }
                l6 l6Var2 = p5.e;
                if (l6Var2 != null) {
                    r6.g(l6Var2, hashSet);
                }
                l6 l6Var3 = p5.f;
                if (l6Var3 != null) {
                    r6.g(l6Var3, hashSet);
                }
            }
        }
        if (!(view instanceof RecyclerView)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                while (i10 < viewGroup.getChildCount()) {
                    b(viewGroup.getChildAt(i10));
                    i10++;
                }
                return;
            }
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        boolean z10 = this.b;
        for (int i14 = 0; i14 < recyclerView.getChildCount(); i14++) {
            b(recyclerView.getChildAt(i14));
        }
        for (int i15 = 0; i15 < recyclerView.getHiddenChildCount(); i15++) {
            b(recyclerView.V(i15));
        }
        for (int i16 = 0; i16 < recyclerView.getAttachedScrapChildCount(); i16++) {
            b(recyclerView.O(i16));
        }
        for (int i17 = 0; i17 < recyclerView.getCachedChildCount(); i17++) {
            b(recyclerView.P(i17));
        }
        if (!z10 || (recycledViewPool = recyclerView.getRecycledViewPool()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = recycledViewPool.a;
        for (int i18 = 0; i18 < sparseArray.size(); i18++) {
            ArrayList arrayList2 = ((s4.s0) sparseArray.valueAt(i18)).a;
            for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                arrayList.add(((s4.b1) arrayList2.get(i19)).a);
            }
        }
        while (i10 < arrayList.size()) {
            b((View) arrayList.get(i10));
            i10++;
        }
    }
}
