package ii;

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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.w70;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final /* synthetic */ class t5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d6 b;

    public /* synthetic */ t5(d6 d6Var, int i10) {
        this.a = i10;
        this.b = d6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Set<String> languages;
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
                        w3 w3Var = ((e3) a6Var).a;
                        aVar2.f = z11;
                        h2 h2Var = w3Var.J3;
                        if (h2Var != null) {
                            h2Var.d();
                            w3Var.J3.h();
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
                    w3 w3Var2 = ((e3) a6Var2).a;
                    if (aVar3 != null && (aVar3.b instanceof TL_iv.pageBlockPreformatted) && (languages = CodeHighlighting.getLanguages()) != null) {
                        ArrayList arrayList = new ArrayList(languages);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.b;
                        w70 F = w3Var2.h3.F(view);
                        F.W(j6.b0(AndroidUtilities.dp(3.0f), j6.v0(j6.d6, w3Var2.g3)));
                        F.Z = true;
                        F.X = AndroidUtilities.dp(350.0f);
                        F.i(new o2(w3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            F.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        F.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            F.i(new gg.t(w3Var2, aVar3, str, 17), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        F.Z();
                        break;
                    }
                }
                break;
        }
    }
}
