package li;

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
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.k80;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d6 b;

    public /* synthetic */ u5(d6 d6Var, int i10) {
        this.a = i10;
        this.b = d6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Set set;
        switch (this.a) {
            case 0:
                d6 d6Var = this.b;
                a aVar = d6Var.x;
                if (aVar != null && aVar.e) {
                    boolean z10 = !aVar.f;
                    aVar.f = z10;
                    ((CheckBoxBase) d6Var.e.b).f(-1, z10, true);
                    a6 a6Var = d6Var.y;
                    if (a6Var != null) {
                        a aVar2 = d6Var.x;
                        boolean z11 = aVar2.f;
                        v3 v3Var = ((d3) a6Var).a;
                        aVar2.f = z11;
                        f2 f2Var = v3Var.R3;
                        if (f2Var != null) {
                            f2Var.d();
                            v3Var.R3.h();
                            break;
                        }
                    }
                }
                break;
            default:
                d6 d6Var2 = this.b;
                a6 a6Var2 = d6Var2.y;
                if (a6Var2 != null) {
                    a aVar3 = d6Var2.x;
                    v3 v3Var2 = ((d3) a6Var2).a;
                    if (aVar3 != null && (aVar3.b instanceof TL_iv.pageBlockPreformatted) && (set = ni.k.a.x) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.b;
                        k80 P = v3Var2.p3.P(view);
                        P.W(y6.c0(AndroidUtilities.dp(3.0f), y6.w0(y6.d6, v3Var2.o3)));
                        P.Z = true;
                        P.X = AndroidUtilities.dp(350.0f);
                        P.i(new m2(v3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            P.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        P.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            P.i(new jg.f1(v3Var2, aVar3, str, 6), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        P.Z();
                        break;
                    }
                }
                break;
        }
    }
}
