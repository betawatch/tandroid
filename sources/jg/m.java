package jg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.iz;
import org.telegram.messenger.k5;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.w9;
import org.telegram.ui.vw;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class m extends FrameLayout {
    public boolean a;
    public final /* synthetic */ n b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Context context) {
        super(context);
        this.b = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0134, code lost:
    
        if (r8 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0136, code lost:
    
        r14 = r14 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015f, code lost:
    
        if (r8 != false) goto L75;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        n nVar = this.b;
        int size = nVar.M.size();
        int i13 = nVar.r;
        boolean z9 = i13 == 0 && nVar.h == 0 && qp.s1(nVar.F).Q.f(2305843009213693952L | ((long) 1)) != null;
        View view = (View) getParent();
        int i14 = view instanceof w9 ? ((w9) view).e3 : 0;
        boolean z10 = nVar.J;
        int paddingTop = view.getPaddingTop();
        int paddingBottom = view.getPaddingBottom();
        int i15 = paddingTop - i14;
        if (i13 == 1 && size == 1 && ((l) nVar.M.get(0)).a == 19) {
            i11 = View.MeasureSpec.getSize(i10);
            if (i11 == 0) {
                i11 = view.getMeasuredHeight();
            }
            if (i11 == 0) {
                i11 = (org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m;
            }
            if (nVar.R.K) {
                i11 += org.telegram.messenger.g0.L(81.0f);
            }
        } else {
            if (size != 0 && (i15 != 0 || z9)) {
                int size2 = View.MeasureSpec.getSize(i10);
                if (size2 == 0) {
                    size2 = view.getMeasuredHeight();
                }
                if (size2 == 0) {
                    size2 = (org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m;
                }
                int i16 = size2 - i14;
                int L = org.telegram.messenger.g0.L(iz.p1 ? 76.0f : 70.0f);
                int i17 = 0;
                for (int i18 = 0; i18 < size; i18++) {
                    if (((l) nVar.M.get(i18)).a == 0) {
                        if (((l) nVar.M.get(i18)).f && !z10) {
                            i17 += org.telegram.messenger.g0.L(iz.p1 ? 86.0f : 91.0f);
                        }
                        i17 += L;
                    } else {
                        if (((l) nVar.M.get(i18)).a != 1) {
                        }
                        i17 += L;
                    }
                }
                int i19 = (size - 1) + i17;
                ArrayList arrayList = nVar.d;
                if (arrayList != null) {
                    i19 = k5.C(52.0f, (nVar.d.size() - 1) + (org.telegram.messenger.g0.L(58.0f) * arrayList.size()), i19);
                }
                int i20 = z9 ? L + 1 : 0;
                if (i19 < i16) {
                    i11 = ((i16 - i19) + i20) - paddingBottom;
                    if (i15 != 0) {
                        i11 -= org.telegram.messenger.g0.m;
                        if (!z10 && !nVar.S) {
                            i11 -= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                            if (getParent() instanceof vw) {
                                i12 = ((vw) getParent()).z3;
                                i11 -= i12;
                            }
                        }
                    }
                } else {
                    int i21 = i19 - i16;
                    if (i21 < i20) {
                        i11 = (i20 - i21) - paddingBottom;
                        if (i15 != 0) {
                            i11 -= org.telegram.messenger.g0.m;
                            if (!z10 && !nVar.S) {
                                i11 -= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                                if (getParent() instanceof vw) {
                                    i12 = ((vw) getParent()).z3;
                                    i11 -= i12;
                                }
                            }
                        }
                    }
                }
            }
            i11 = 0;
        }
        int i22 = i11 >= 0 ? i11 : 0;
        if (nVar.S) {
            i22 += org.telegram.messenger.g0.L(1000.0f);
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i22, TLObject.FLAG_30));
    }
}
