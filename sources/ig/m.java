package ig;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ka;
import org.telegram.ui.wx;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        n nVar = this.b;
        int size = nVar.M.size();
        int i14 = nVar.r;
        boolean z10 = i14 == 0 && nVar.h == 0 && MessagesController.getInstance(nVar.F).dialogs_dict.f(DialogObject.makeFolderDialogId(1)) != null;
        View view = (View) getParent();
        int i15 = view instanceof ka ? ((ka) view).f3 : 0;
        boolean z11 = nVar.J;
        int paddingTop = view.getPaddingTop();
        int paddingBottom = view.getPaddingBottom();
        int i16 = paddingTop - i15;
        if (i14 == 1 && size == 1 && ((l) nVar.M.get(0)).a == 19) {
            i12 = View.MeasureSpec.getSize(i11);
            if (i12 == 0) {
                i12 = view.getMeasuredHeight();
            }
            if (i12 == 0) {
                i12 = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
            }
            if (nVar.R.K) {
                i12 += AndroidUtilities.dp(81.0f);
            }
        } else {
            if (size != 0 && (i16 != 0 || z10)) {
                int size2 = View.MeasureSpec.getSize(i11);
                if (size2 == 0) {
                    size2 = view.getMeasuredHeight();
                }
                if (size2 == 0) {
                    size2 = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                }
                int i17 = size2 - i15;
                int dp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f);
                int i18 = 0;
                for (int i19 = 0; i19 < size; i19++) {
                    if (((l) nVar.M.get(i19)).a == 0) {
                        if (((l) nVar.M.get(i19)).f && !z11) {
                            i18 += AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 86.0f : 91.0f);
                        }
                        i18 += dp;
                    } else {
                        if (((l) nVar.M.get(i19)).a != 1) {
                        }
                        i18 += dp;
                    }
                }
                int i20 = (size - 1) + i18;
                ArrayList arrayList = nVar.d;
                if (arrayList != null) {
                    i20 = org.telegram.messenger.t.D(52.0f, (nVar.d.size() - 1) + (AndroidUtilities.dp(58.0f) * arrayList.size()), i20);
                }
                int i21 = z10 ? dp + 1 : 0;
                if (i20 < i17) {
                    i12 = ((i17 - i20) + i21) - paddingBottom;
                    if (i16 != 0) {
                        i12 -= AndroidUtilities.statusBarHeight;
                        if (!z11 && !nVar.S) {
                            i12 -= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                            if (getParent() instanceof wx) {
                                i13 = ((wx) getParent()).A3;
                                i12 -= i13;
                            }
                        }
                    }
                } else {
                    int i22 = i20 - i17;
                    if (i22 < i21) {
                        i12 = (i21 - i22) - paddingBottom;
                        if (i16 != 0) {
                            i12 -= AndroidUtilities.statusBarHeight;
                            if (!z11 && !nVar.S) {
                                i12 -= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                if (getParent() instanceof wx) {
                                    i13 = ((wx) getParent()).A3;
                                    i12 -= i13;
                                }
                            }
                        }
                    }
                }
            }
            i12 = 0;
        }
        int i23 = i12 >= 0 ? i12 : 0;
        if (nVar.S) {
            i23 += AndroidUtilities.dp(1000.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i23, TLObject.FLAG_30));
    }
}
