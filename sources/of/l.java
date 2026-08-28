package of;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.aa;
import org.telegram.ui.yx;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l extends FrameLayout {
    public boolean a;
    public final /* synthetic */ m b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context) {
        super(context);
        this.b = mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0135, code lost:
    
        if (r8 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0137, code lost:
    
        r14 = r14 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0160, code lost:
    
        if (r8 != false) goto L75;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        m mVar = this.b;
        int size = mVar.I.size();
        int i13 = mVar.r;
        boolean z10 = i13 == 0 && mVar.h == 0 && MessagesController.getInstance(mVar.B).dialogs_dict.f(DialogObject.makeFolderDialogId(1)) != null;
        View view = (View) getParent();
        int i14 = view instanceof aa ? ((aa) view).T2 : 0;
        boolean z11 = mVar.F;
        int paddingTop = view.getPaddingTop();
        int paddingBottom = view.getPaddingBottom();
        int i15 = paddingTop - i14;
        if (i13 == 1 && size == 1 && ((k) mVar.I.get(0)).a == 19) {
            i11 = View.MeasureSpec.getSize(i10);
            if (i11 == 0) {
                i11 = view.getMeasuredHeight();
            }
            if (i11 == 0) {
                i11 = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
            }
            if (mVar.N.G) {
                i11 += AndroidUtilities.dp(81.0f);
            }
        } else {
            if (size != 0 && (i15 != 0 || z10)) {
                int size2 = View.MeasureSpec.getSize(i10);
                if (size2 == 0) {
                    size2 = view.getMeasuredHeight();
                }
                if (size2 == 0) {
                    size2 = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                }
                int i16 = size2 - i14;
                int dp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f);
                int i17 = 0;
                for (int i18 = 0; i18 < size; i18++) {
                    if (((k) mVar.I.get(i18)).a == 0) {
                        if (((k) mVar.I.get(i18)).f && !z11) {
                            i17 += AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 86.0f : 91.0f);
                        }
                        i17 += dp;
                    } else {
                        if (((k) mVar.I.get(i18)).a != 1) {
                        }
                        i17 += dp;
                    }
                }
                int i19 = (size - 1) + i17;
                ArrayList arrayList = mVar.d;
                if (arrayList != null) {
                    i19 = org.telegram.messenger.l0.C(52.0f, (mVar.d.size() - 1) + (AndroidUtilities.dp(58.0f) * arrayList.size()), i19);
                }
                int i20 = z10 ? dp + 1 : 0;
                if (i19 < i16) {
                    i11 = ((i16 - i19) + i20) - paddingBottom;
                    if (i15 != 0) {
                        i11 -= AndroidUtilities.statusBarHeight;
                        if (!z11 && !mVar.O) {
                            i11 -= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                            if (getParent() instanceof yx) {
                                i12 = ((yx) getParent()).p3;
                                i11 -= i12;
                            }
                        }
                    }
                } else {
                    int i21 = i19 - i16;
                    if (i21 < i20) {
                        i11 = (i20 - i21) - paddingBottom;
                        if (i15 != 0) {
                            i11 -= AndroidUtilities.statusBarHeight;
                            if (!z11 && !mVar.O) {
                                i11 -= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                if (getParent() instanceof yx) {
                                    i12 = ((yx) getParent()).p3;
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
        if (mVar.O) {
            i22 += AndroidUtilities.dp(1000.0f);
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(i22, TLObject.FLAG_30));
    }
}
