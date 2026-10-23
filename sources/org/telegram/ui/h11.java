package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class h11 extends org.telegram.ui.Components.d91 {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.ss0 b;

    public h11(org.telegram.ui.Components.ss0 ss0Var) {
        this.b = ss0Var;
    }

    @Override // org.telegram.ui.Components.d91
    public final void a(ArrayList arrayList) {
        org.telegram.ui.Components.ss0 ss0Var = this.b;
        my0 my0Var = ss0Var.G;
        org.telegram.ui.Components.k91 k91Var = ss0Var.n;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            if (intValue != -1 && intValue != -2 && intValue != 0) {
                arrayList2.add(num);
            }
        }
        int f7 = f(k91Var.getCurrentPosition());
        ci.v6 v6Var = ss0Var.r;
        v6Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = v6Var.h;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            ci.a7 a7Var = (ci.a7) obj2;
            hashMap.put(Integer.valueOf(a7Var.a), a7Var);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        while (i10 < size3) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            ci.a7 a7Var2 = (ci.a7) hashMap.get(num2);
            if (a7Var2 != null) {
                arrayList4.add(a7Var2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        if (f7 >= 0) {
            int i13 = i(f7);
            k91Var.e(0.0f, i13, i13);
        }
        AndroidUtilities.cancelRunOnUIThread(my0Var);
        AndroidUtilities.runOnUIThread(my0Var, 1000L);
    }

    @Override // org.telegram.ui.Components.d91
    public final boolean c(int i10) {
        if (i10 == 0) {
            return false;
        }
        return (this.a && i10 == e() - 1) ? false : true;
    }

    @Override // org.telegram.ui.Components.d91
    public final View d(int i10) {
        if (i10 == -1) {
            return null;
        }
        return new View(this.b.getContext());
    }

    @Override // org.telegram.ui.Components.d91
    public final int e() {
        return this.b.r.h.size() + 1 + (this.a ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.d91
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.a && i10 == e() - 1) {
            return -1;
        }
        return ((ci.a7) this.b.r.h.get(i10 - 1)).a;
    }

    @Override // org.telegram.ui.Components.d91
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.StoriesAlbumNameAllStories);
        }
        if (!this.a || i10 != e() - 1) {
            return ((ci.a7) this.b.r.h.get(i10 - 1)).b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoriesAlbumAddAlbum));
        org.telegram.ui.Components.xq xqVar = new org.telegram.ui.Components.xq(R.drawable.poll_add_plus, 0);
        xqVar.spaceScaleX = 0.8f;
        spannableStringBuilder.setSpan(xqVar, 0, 1, 33);
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.d91
    public final int h(int i10) {
        if (this.a && i10 == e() - 1) {
            return -1;
        }
        return i10;
    }

    public final int i(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int c10 = this.b.r.c(i10);
        if (c10 == -1) {
            return -1;
        }
        return c10 + 1;
    }

    @Override // org.telegram.ui.Components.d91
    public final void b(View view, int i10, int i11) {
    }
}
