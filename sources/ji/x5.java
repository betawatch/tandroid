package ji;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.n70;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class x5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6 b;

    public /* synthetic */ x5(g6 g6Var, int i10) {
        this.a = i10;
        this.b = g6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Set<String> languages;
        switch (this.a) {
            case 0:
                g6 g6Var = this.b;
                a aVar = g6Var.x;
                if (aVar != null && aVar.e) {
                    boolean z10 = !aVar.f;
                    aVar.f = z10;
                    ((CheckBoxBase) g6Var.e.b).f(-1, z10, true);
                    d6 d6Var = g6Var.y;
                    if (d6Var != null) {
                        a aVar2 = g6Var.x;
                        boolean z11 = aVar2.f;
                        v3 v3Var = ((d3) d6Var).a;
                        aVar2.f = z11;
                        g2 g2Var = v3Var.J3;
                        if (g2Var != null) {
                            g2Var.d();
                            v3Var.J3.h();
                            break;
                        }
                    }
                }
                break;
            default:
                g6 g6Var2 = this.b;
                d6 d6Var2 = g6Var2.y;
                if (d6Var2 != null) {
                    a aVar3 = g6Var2.x;
                    v3 v3Var2 = ((d3) d6Var2).a;
                    if (aVar3 != null && (aVar3.b instanceof TL_iv.pageBlockPreformatted) && (languages = CodeHighlighting.getLanguages()) != null) {
                        ArrayList arrayList = new ArrayList(languages);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.b;
                        n70 t10 = v3Var2.h3.t(view);
                        t10.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, v3Var2.g3)));
                        t10.Z = true;
                        t10.X = AndroidUtilities.dp(350.0f);
                        t10.i(new n2(v3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            t10.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        t10.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            t10.i(new hg.t(v3Var2, aVar3, str, 17), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        t10.Z();
                        break;
                    }
                }
                break;
        }
    }
}
