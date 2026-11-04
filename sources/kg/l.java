package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.messenger.hp;
import org.telegram.messenger.k5;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.w9;
import org.telegram.ui.pw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l extends FrameLayout {
    public boolean a;
    public final /* synthetic */ m b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context) {
        super(context);
        this.b = mVar;
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
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        m mVar = this.b;
        int size = mVar.N.size();
        int i13 = mVar.r;
        boolean z10 = i13 == 0 && mVar.h == 0 && hp.s1(mVar.G).R.f(2305843009213693952L | ((long) 1)) != null;
        View view = (View) getParent();
        int i14 = view instanceof w9 ? ((w9) view).f3 : 0;
        boolean z11 = mVar.K;
        int paddingTop = view.getPaddingTop();
        int paddingBottom = view.getPaddingBottom();
        int i15 = paddingTop - i14;
        if (i13 == 1 && size == 1 && ((k) mVar.N.get(0)).a == 19) {
            i11 = View.MeasureSpec.getSize(i10);
            if (i11 == 0) {
                i11 = view.getMeasuredHeight();
            }
            if (i11 == 0) {
                i11 = (org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m;
            }
            if (mVar.S.L) {
                i11 += org.telegram.messenger.g0.L(81.0f);
            }
        } else {
            if (size != 0 && (i15 != 0 || z10)) {
                int size2 = View.MeasureSpec.getSize(i10);
                if (size2 == 0) {
                    size2 = view.getMeasuredHeight();
                }
                if (size2 == 0) {
                    size2 = (org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m;
                }
                int i16 = size2 - i14;
                int L = org.telegram.messenger.g0.L(az.p1 ? 76.0f : 70.0f);
                int i17 = 0;
                for (int i18 = 0; i18 < size; i18++) {
                    if (((k) mVar.N.get(i18)).a == 0) {
                        if (((k) mVar.N.get(i18)).f && !z11) {
                            i17 += org.telegram.messenger.g0.L(az.p1 ? 86.0f : 91.0f);
                        }
                        i17 += L;
                    } else {
                        if (((k) mVar.N.get(i18)).a != 1) {
                        }
                        i17 += L;
                    }
                }
                int i19 = (size - 1) + i17;
                ArrayList arrayList = mVar.d;
                if (arrayList != null) {
                    i19 = k5.C(52.0f, (mVar.d.size() - 1) + (org.telegram.messenger.g0.L(58.0f) * arrayList.size()), i19);
                }
                int i20 = z10 ? L + 1 : 0;
                if (i19 < i16) {
                    i11 = ((i16 - i19) + i20) - paddingBottom;
                    if (i15 != 0) {
                        i11 -= org.telegram.messenger.g0.m;
                        if (!z11 && !mVar.T) {
                            i11 -= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                            if (getParent() instanceof pw) {
                                i12 = ((pw) getParent()).A3;
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
                            if (!z11 && !mVar.T) {
                                i11 -= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                if (getParent() instanceof pw) {
                                    i12 = ((pw) getParent()).A3;
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
        if (mVar.T) {
            i22 += org.telegram.messenger.g0.L(1000.0f);
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(i22, TLObject.FLAG_30));
    }
}
