package ki;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.i80;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;

    public /* synthetic */ t5(c6 c6Var, int i10) {
        this.a = i10;
        this.b = c6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Set set;
        switch (this.a) {
            case 0:
                c6 c6Var = this.b;
                a aVar = c6Var.x;
                if (aVar != null && aVar.e) {
                    boolean z10 = !aVar.f;
                    aVar.f = z10;
                    ((CheckBoxBase) c6Var.e.b).f(-1, z10, true);
                    z5 z5Var = c6Var.y;
                    if (z5Var != null) {
                        a aVar2 = c6Var.x;
                        boolean z11 = aVar2.f;
                        w3 w3Var = ((e3) z5Var).a;
                        aVar2.f = z11;
                        h2 h2Var = w3Var.H3;
                        if (h2Var != null) {
                            h2Var.d();
                            w3Var.H3.h();
                            break;
                        }
                    }
                }
                break;
            default:
                c6 c6Var2 = this.b;
                z5 z5Var2 = c6Var2.y;
                if (z5Var2 != null) {
                    a aVar3 = c6Var2.x;
                    w3 w3Var2 = ((e3) z5Var2).a;
                    if (aVar3 != null && (aVar3.b instanceof TL_iv.pageBlockPreformatted) && (set = mi.k.a.x) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.b;
                        i80 C = w3Var2.f3.C(view);
                        C.W(h6.c0(AndroidUtilities.dp(3.0f), h6.w0(h6.d6, w3Var2.e3)));
                        C.Z = true;
                        C.X = AndroidUtilities.dp(350.0f);
                        C.i(new o2(w3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            C.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        C.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            C.i(new ig.e2(w3Var2, aVar3, str, 5), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        C.Z();
                        break;
                    }
                }
                break;
        }
    }
}
